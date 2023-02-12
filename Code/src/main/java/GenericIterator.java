import java.util.Iterator;

public class GenericIterator<T> implements Iterator<T> 
{
    private GenericList<T>.Node<T> index;

    public GenericIterator(GenericList<T>.Node<T> head)
    {
        index = head;
    }

    @Override
    public boolean hasNext() 
    {
        return index != null;
    }

    @Override
    public T next() 
    {
        T cur = index.data;

        if(hasNext()){
            index = index.next;
        }

        return cur;
    }

    @Override
    public void remove() { }

    public void descendingIterator()
    {
        if (index == null) 
        {
            System.out.println("Empty List");
        } 
        else 
        {
            GenericList<T>.Node<T> current = index;
            while (current != null) 
            {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}