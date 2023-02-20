public class GenericQueue<T> extends GenericList<T> {
  private Node<T> tail; // declare a private instance variable of type Node that points to the tail of the queue

  public GenericQueue() {} // default constructor

  public GenericQueue(T data) {
    Node<T> node = new Node<T>(); // create a new node object
    node.data = data; // assign data to the node
    node.next = null; // set the next node to null
    setHead(node); // set the node as the head of the queue
    this.tail = node; // set the node as the tail of the queue
    setLength(1); // set the length of the queue to 1
  }

  public T delete() { // remove the head of the queue
    Node<T> head = getHead(); // get the head of the queue

    if (
      head == null
    ) { // if the queue is empty
      return null; // return null
    }

    if (
      head.next == null
    ) { // if the queue has only one node
      head = null; // set the head to null
    } else { // if the queue has more than one node
      Node<T> current = head; // set current to the head
      while (
        current.next.next != null
      ) { // find the second-to-last node
        current = current.next;
      }
      current.next = null; // set the next node to null
    }

    setLength(getLength() - 1); // decrease the length of the queue

    if (
      head.data == null
    ) { // if the data at the head is null
      head.data = null; // set the data to null
    }

    return head.data; // return the data at the head
  }

  public void add(T data) { // add a new node to the tail of the queue
    Node<T> node = new Node<T>(data); // create a new node object with the provided data

    this.tail.next = node; // set the next node of the tail to the new node
    this.tail = node; // set the new node as the tail of the queue
    setLength(getLength() + 1); // increase the length of the queue
  }

  public void add(T data, int code) { // add a new node to the tail of the queue with a specified code
    Node<T> node = new Node<T>(data, code); // create a new node object with the provided data and code
    tail.next = node; // set the next node of the tail to the new node
    tail = node; // set the new node as the tail of the queue
    setLength(getLength() + 1); // increase the length of the queue
  }

  public void enqueue(T data) { // add a new node to the tail of the queue (same as add method)
    add(data);
  }

  public T dequeue() { // remove the head of the queue (same as delete method)
    return delete();
  }
}
