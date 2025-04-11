package in.ashokit.testController;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.ashokit.controller.MsgRestController;
import in.ashokit.service.MsgService;

@WebMvcTest(value=MsgRestController.class)
public class TestMsgController {
	
	@MockitoBean
	private MsgService msgService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGreet() throws Exception {
		
		when(msgService.getGreetMsg()).thenReturn("Good Afternoon");
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/greet");
		
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		String actual = response.getContentAsString();
		String expected = "good afternoon";
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testWelcome() throws Exception {
		
		when(msgService.getWelcomeMsg()).thenReturn("Welcome");
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int actual = response.getStatus();
		
		int expected = 200;
		
		Assertions.assertEquals(expected, actual);
		
		
	}

}
