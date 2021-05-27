package in.vignesh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import in.vignesh.validator.UserValidation;

public class CustomerIdTestCase {

	@Test
	public void test1() {

		String customerId = "vig03324";
		boolean value = UserValidation.isValidCustomerId(customerId);
		assertTrue(value);
	}

	@Test
	public void test2() {

		String customerId = "vig 03324";
		boolean value = UserValidation.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test3() {

		String customerId = "vign3324";
		boolean value = UserValidation.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test4() {

		String customerId = "vigneshk";
		boolean value = UserValidation.isValidCustomerId(customerId);
		assertFalse(value);
	}

	@Test
	public void test5() {

		String customerId = "12345678";
		boolean value = UserValidation.isValidCustomerId(customerId);
		assertFalse(value);
	}


}
