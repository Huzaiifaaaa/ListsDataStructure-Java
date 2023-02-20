import java.util.Iterator;

public class GLLIterator<T> implements Iterator<T> {
  // Declare a private instance variable of the inner class Node<T> of the outer class GenericList<T>.
  private GenericList<T>.Node<T> index;

  // Constructor that accepts a Node<T> as a parameter, to initialize the index instance variable.
  public GLLIterator(GenericList<T>.Node<T> head) {
    index = head;
  }

  // Override the hasNext() method of the Iterator interface to check if there is a next element in the list.
  @Override
  public boolean hasNext() {
    return index != null;
  }

  // Override the next() method of the Iterator interface to return the current element and move the iterator to the next element.
  @Override
  public T next() {
    T cur = index.data;

    if (hasNext()) {
      index = index.next;
    }

    return cur;
  }

  // Override the remove() method of the Iterator interface but leave it empty, since we do not support element removal.
  @Override
  public void remove() {}

  // Define a method to print the list elements in reverse order.
  public void descendingIterator() {
    // Check if the list is empty.
    if (index == null) {
      System.out.println("Empty List");
    } else {
      // Traverse the list from the current position to the end, printing each element.
      GenericList<T>.Node<T> current = index;
      while (current != null) {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }
}
