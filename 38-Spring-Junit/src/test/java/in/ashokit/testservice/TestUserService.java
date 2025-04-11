package in.ashokit.testservice;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import in.ashokit.dao.User;
import in.ashokit.service.UserService;

@SpringBootTest
@ExtendWith(value=MockitoExtension.class)
public class TestUserService {
	
	@MockitoBean
	private User user;
	
	@InjectMocks
	private UserService userService;
	
	@Test
	public void testUserService() {
		
		// when(userService.saveUser(any())).thenReturn(true);
		
		User user = new User();
		user.setId(205);
		user.setName("Niku");

		boolean actual = userService.saveUser(user);
		
		assertTrue(actual);
	}

}
