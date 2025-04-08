package in.ashokit.testUserService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.ashokit.service.UserService;

public class TestUserService {

	@Test
	public void testAdd() {

		UserService service = new UserService();

		int actualResult = service.add(10, 20);
		int expectedResult = 30;

		Assertions.assertEquals(expectedResult, actualResult);

	}

}
