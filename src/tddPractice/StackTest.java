package tddPractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack stack;

	@Before
	public void setUp() {
		stack = new Stack();
	}

	@Test
	public void isEmptyReturnsTrue() {
		// setup

		// action
		Boolean result = stack.isEmpty();

		// assert
		assertTrue(result);

	}

//	@Test
//	public void isEmptyReturnsFalse() {
//		// setup
//		stack.data = new Object();
//
//		// action
//		Boolean result = stack.isEmpty();
//
//		// assert
//		assertFalse(result);
//	}

//	@Test
//	public void getDataShouldReturnObject_givenObject() {
//		// setup
//		stack.data = 1;
//
//		// action
//		Object result = stack.peek();
//
//		// assert
//		assertEquals(result, 1);
//	}

	@Test
	public void getDataShouldReturnNull() {
		// setup

		// action
		Object result = stack.peek();

		// assert
		assertEquals(result, null);
	}

	// push should add an element to the end of a stack;
	@Test
	public void pushShouldAddElementToEndOfStack() {
		// setup
		stack.push(1);
		// action
		Object result = stack.peek();

		// assert
		assertEquals(result, 1);

	}

	// pop should return the last element in a stack;
	// pop should remove the last element in a stack;
	// pop should throw an exception error if pop null

}
