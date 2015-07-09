package List;

public class MyLinkedList<T> {
  public class Node<E> {
    public E Data;

    public Node<E> Next;
  }

  public Node<T> Head;
  public Node<T> Tail = Head;

  /**
   * Add an item to the end
   */
  public void add(T item) {
    Node<T> node = new Node<>();
    node.Data = item;
    addNode(node);
  }

  /**
   * Similar to add
   */
  public void addNode(Node<T> node) {
    if (isEmpty()) {
      Head = node;
      Tail = Head;
    } else {
      Tail.Next = node;
      Tail = node;
    }
  }

  /**
   * Remove and return the last node
   */
  public T removeLast() {
    if (isEmpty())
      return null;

    if (Head == Tail) {
      try {
        return Head.Data;
      } finally {
        Head = null;
        Tail = null;
      }
    }

    Node<T> previousToTail = Head;

    while (previousToTail.Next != Tail) {
      previousToTail = previousToTail.Next;
    }

    Tail = previousToTail;

    try {
      return Tail.Next.Data;
    } finally {
      Tail.Next = null;
    }
  }

  /**
   * Remove amd return the first node
   */
  public T removeFirst() {
    if (isEmpty())
      return null;

    if (Head == Tail) {
      try {
        return Head.Data;
      } finally {
        Head = null;
        Tail = null;
      }
    }

    try {
      return Head.Data;
    } finally {
      Head = Head.Next;
    }
  }

  /**
   * Check is the LinkedList is empty
   *
   * @return true if list is empty; otherwise, false
   */
  public boolean isEmpty() {
    return Head == null;
  }

}
