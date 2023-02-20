import java.util.ArrayList;
import java.util.Iterator;

public abstract class GenericList<T> implements GenericInterface<T> {
  // The head of the list
  private Node<T> head;

  // The length of the list
  private int length;

  // Abstract methods that will be implemented in subclasses
  public abstract void add(T data);

  public abstract T delete();

  // Prints the contents of the list
  public void print() {
    if (head == null) {
      System.out.println("Empty List");
    } else {
      Node<T> current = head;
      while (current != null) {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }

  // Returns an ArrayList containing the contents of the list
  public ArrayList<T> dumpList() {
    ArrayList<T> result = new ArrayList<>();
    Node<T> current = head;
    while (current != null) {
      result.add(current.data);
      current = current.next;
    }
    return result;
  }

  // Returns the element at the specified index
  public T get(int index) {
    if (index >= length || index < 0) {
      return null;
    }

    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    return current.data;
  }

  // Sets the element at the specified index to the given element and returns the previous element
  public T set(int index, T element) {
    if (index >= length || index < 0) {
      return null;
    }

    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    T previous = current.data;
    current.data = element;

    return previous;
  }

  // Returns the length of the list
  public int getLength() {
    return length;
  }

  // Sets the length of the list
  public void setLength(int length) {
    this.length = length;
  }

  // Returns the head of the list
  public Node<T> getHead() {
    return head;
  }

  // Sets the head of the list
  public void setHead(Node<T> head) {
    this.head = head;
  }

  // Implementation of the GenericInterface method that returns a GenericIterator
  @Override
  public GLLIterator<T> GenericInterface() {
    return new GLLIterator<>(getHead());
  }

  // The Node class that holds the data and a reference to the next Node
  class Node<T> {
    T data;
    int code;
    Node<T> next;

    // Default constructor
    public Node() {}

    // Constructor that initializes the Node with the given data and a null reference to the next Node
    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    // Constructor that initializes the Node with the given data, code, and a null reference to the next Node
    public Node(T data, int code) {
      this.data = data;
      this.code = code;
      this.next = null;
    }
  }
}
