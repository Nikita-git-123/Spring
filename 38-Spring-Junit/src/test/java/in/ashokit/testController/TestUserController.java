package in.ashokit.testController;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.controller.UserRestController;
import in.ashokit.dao.User;
import in.ashokit.service.UserService;

@WebMvcTest(value=UserRestController.class)
public class TestUserController {
	
	@MockitoBean
	private UserService userService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testUserController_TC1() throws Exception {
		
		User user = new User();
		user.setId(101);
		user.setName("Nikita");
		
		ObjectMapper mapper = new ObjectMapper();
		String userJson = mapper.writeValueAsString(mapper);
		
		when(userService.saveUser(any())).thenReturn(true);
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/user")
																		 .content(userJson)
																		 .contentType("application/json");
		
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int actual = response.getStatus();
		int expected = 201;
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testUserController_TC2() throws Exception {
		
		User user = new User();
		user.setId(101);
		user.setName("Nikita");
		
		ObjectMapper mapper = new ObjectMapper();
		String userJson = mapper.writeValueAsString(mapper);
		
		when(userService.saveUser(any())).thenReturn(false);
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/user")
																		 .content(userJson)
																		 .contentType("application/json");
		
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int actual = response.getStatus();
		int expected = 500;
		
		Assertions.assertEquals(expected, actual);
	}
	
	

}
