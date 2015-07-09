package Stack;

import List.MyLinkedList;


public class MyStack<T> {

  private MyLinkedList<T> _list = new MyLinkedList<>();

  public void push(T item) {
    _list.add(item);
  }

  public T pop() {
    return _list.removeLast();
  }

  public boolean isEmpty() {
    return _list.isEmpty();
  }
}
