package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FailTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int result = test.failure(3, 4);
		assertEquals(12, result);
	}

}
