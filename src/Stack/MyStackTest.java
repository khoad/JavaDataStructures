package Stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class MyStackTest {

  @Test
  public void testPushPop() throws Exception {
    MyStack<Integer> stack = new MyStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    assert stack.pop() == 3;
    assert stack.pop() == 2;
    assert stack.pop() == 1;
    assert stack.pop() == null;
  }

  @Test
  public void testIsEmpty() throws Exception {
    MyStack<Integer> stack = new MyStack<>();

    assert stack.isEmpty();

    stack.push(1);

    assertFalse(stack.isEmpty());

    stack.pop();

    assert stack.isEmpty();
  }
}