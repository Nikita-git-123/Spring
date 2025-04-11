package in.ashokit.testservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMsgService {
	
	@Test
	public void testWelcomeMsg() {
		
		String actual = "Welcome to ashok it....";
		
		String expected = "Welcome to ashok it....";
		
		assertEquals(expected, actual);
	}
	

}
