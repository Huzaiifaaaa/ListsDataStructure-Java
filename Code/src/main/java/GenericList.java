import java.util.ArrayList;
import java.util.Iterator;

public abstract class GenericList<T> implements Iterable<T>
{
    private Node<T> head;
    private int length;

    public abstract void add(T data);
    public abstract T delete();

    public void print() 
    {
        if (head == null) 
        {
            System.out.println("Empty List");
        } 
        else 
        {
            Node<T> current = head;
            while (current != null) 
            {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public ArrayList<T> dumpList() 
    {
        ArrayList<T> result = new ArrayList<>();
        Node<T> current = head;
        while (current != null) 
        {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }
    
    public T get(int index) {
        if (index >= length || index < 0) 
        {
            return null;
        }
        
        Node<T> current = head;
        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }
        
        return current.data;
    }
    
    public T set(int index, T element) 
    {
        if (index >= length || index < 0) 
        {
            return null;
        }
        
        Node<T> current = head;
        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }
        
        T previous = current.data;
        current.data = element;
        
        return previous;
    }
    
    public int getLength() 
    {
        return length;
    }
    
    public void setLength(int length) 
    {
        this.length = length;
    }
    
    public Node<T> getHead() 
    {
        return head;
    }
    
    public void setHead(Node<T> head)
    {
        this.head = head;
    }

    public Iterator<T> descendingIterator()
    {
        return new Iterator<T>() 
        {
            Node<T> current = head;
            int index = length - 1;

            @Override
            public boolean hasNext() 
            {
                return index >= 0;
            }

            @Override
            public T next() 
            {
                T data = get(index);
                index--;
                return data;
            }

        };
    }

    class Node<T>
    {
        T data;
        int code;
        Node<T> next;

        public Node() 
        {

        }

        public Node(T data) 
        {
            this.data = data;
            this.next = null;
        }

        public Node(T data, int code) 
        {
            this.data = data;
            this.code = code;
            this.next = null;
        }
    }
}
