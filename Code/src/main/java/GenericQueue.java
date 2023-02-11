
public class GenericQueue<T> extends GenericList<T> 
{
  private Node<T> tail;

  public GenericQueue(T data)
  {
    super();
    tail = getHead();
  }

  public T delete() 
  {
    Node<T> head= getHead();

    if (head == null) 
    {
      return null;
    }
        
    if (head.next == null) 
    {
        head = null;
    } 
    else 
    {
        Node<T> current = head;
        while (current.next.next != null) 
        {
            current = current.next;
        }
        current.next = null;
    }
    
    setLength(getLength() - 1);
  }

  public void add(T data) 
  {
    Node<T> node = new Node<T>(data);
    tail.next= node;
    tail = node;
    setLength(getLength() + 1);
  }

  public void add(T data, int code) 
  {
    Node<T> node = new Node<T>(data, code);
    tail.next= node;
    tail = node;
    setLength(getLength() + 1);
  }

  public void enqueue(T data) 
  {
    add(data);
  }

  public T dequeue() 
  {
    return delete();
  }
}
