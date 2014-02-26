package dcll.mdac.MySimpleStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleStackTest {

	@Test
	public void testCreateEmptyStack() {
		SimpleStack stack = new ExampleStack();
		
		assertTrue("A new stack should be empty", stack.isEmpty());
		assertEquals("A new stack has no elements", 0, stack.getSize());
	}
	@Test
	public void testPush() {
		SimpleStack stack = new ExampleStack();
		Item item = new Item();
		
		stack.push(item);
		assertFalse("The stack must be not empty", stack.isEmpty());
		assertEquals("The stack contains 1 elements", 1, stack.getSize());
		assertSame("The pushed item is on top of the stack", item, stack.peek());
	}
	
	@Test
	public void testPop() {
		SimpleStack stack = new ExampleStack();
		Item item = new Item();
		Item test;
		
		stack.push(item);
		test = stack.pop();
		assertTrue("This stack should be empty", stack.isEmpty());
		assertSame("Ces objets devraient être les mêmes", item, test);
	}

}
