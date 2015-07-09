package List;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {

  @Test
  public void testAdd() throws Exception {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.add(1);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Tail.Data == 1;

    list.add(2);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Tail.Data == 2;

    list.add(3);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next.Data == 3;
    assert list.Tail.Data == 3;

    list.add(4);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next.Data == 3;
    assert list.Head.Next.Next.Next.Data == 4;
    assert list.Tail.Data == 4;
  }

  @Test
  public void testAddNode() throws Exception {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    MyLinkedList<Integer>.Node<Integer> node = list.new Node<>();
    node.Data = 1;
    list.addNode(node);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Tail.Data == 1;

    node = list.new Node<>();
    node.Data = 2;
    list.addNode(node);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Tail.Data == 2;

    node = list.new Node<>();
    node.Data = 3;
    list.addNode(node);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next.Data == 3;
    assert list.Tail.Data == 3;
  }

  @Test
  public void testRemoveLast() throws Exception {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next.Data == 3;
    assert list.Tail.Data == 3;

    list.removeLast();
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next == null;
    assert list.Tail.Data == 2;


    list.removeLast();
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next == null;
    assert list.Tail.Data == 1;

    list.removeLast();
    assertTrue(list.isEmpty());
    assert list.Head == null;
    assert list.Tail == null;
  }

  @Test
  public void testRemoveFirst() throws Exception {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    assertFalse(list.isEmpty());
    assert list.Head.Data == 1;
    assert list.Head.Next.Data == 2;
    assert list.Head.Next.Next.Data == 3;
    assert list.Head.Next.Next.Next == null;
    assert list.Tail.Data == 3;

    list.removeFirst();
    assertFalse(list.isEmpty());
    assert list.Head.Data == 2;
    assert list.Head.Next.Data == 3;
    assert list.Head.Next.Next == null;
    assert list.Tail.Data == 3;

    list.removeFirst();
    assertFalse(list.isEmpty());
    assert list.Head.Data == 3;
    assert list.Head.Next == null;
    assert list.Tail.Data == 3;

    list.removeFirst();
    assertTrue(list.isEmpty());
    assert list.Head == null;
    assert list.Tail == null;
  }

  @Test
  public void testIsEmpty() throws Exception {

  }
}