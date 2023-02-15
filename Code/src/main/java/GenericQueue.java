
public class GenericQueue<T> extends GenericList<T> 
{
  private Node<T> tail;

  public GenericQueue(){}

  public GenericQueue(T data)
  {
    Node<T> node = new Node<T>();
    node.data = data;
    node.next = null;
    setHead(node);
    this.tail = node;
    setLength(1);
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

    if(head.data==null)
    {
      head.data = null;
    }

    return head.data;
  }

  public void add(T data) 
  {
    Node<T> node = new Node<T>(data);
    
    this.tail.next= node;
    this.tail = node;
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
