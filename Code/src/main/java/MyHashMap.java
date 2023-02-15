import java.util.ArrayList;
import java.util.Iterator;

public class MyHashMap<T> //implements Iterable<T> 
{
  private ArrayList<GenericQueue<Node>> map;  

    class Node<T>
    {
        String data;
        T code;
        Node<T> next;   
        public Node() 
        {   
        }   
 
        public Node(String data, T code) 
        {
            this.data = data;
            this.code = code;
            this.next = null;
        }
    }

  public MyHashMap(String key, T value) 
  {
    map = new ArrayList<>(10);
    for (int i = 0; i < 10; i++) 
    {
      map.add(new GenericQueue<>());
    }
    put(key, value);
  }

  public void put(String key, T value) 
  {
    int hashCode = key.hashCode();
    int hashValue = hashCode % 10;
    Node node = new Node(key, value);
    map.get(hashValue).enqueue(node);
  }

//   @Override
//   public Iterator<T> iterator() 
//   {
//     return new MyHashMapIterator();
//   }

//   private class MyHashMapIterator implements Iterator<T> 
//   {
//     int currentIndex = 0;
//     Iterator<Node> currentQueue = map.get(0).iterator();

//     @Override
//     public boolean hasNext() 
//     {
//       if (currentQueue.hasNext()) 
//       {
//         return true;
//       } 
//       else 
//       {
//         currentIndex++;
//         while (currentIndex < map.size() && map.get(currentIndex).isEmpty()) 
//         {
//           currentIndex++;
//         }
//         if (currentIndex < map.size()) 
//         {
//           currentQueue = map.get(currentIndex).iterator();
//           return true;
//         } 
//         else 
//         {
//           return false;
//         }
//     }
//   }
//     @Override
//     public T next() 
//     {
//       return currentQueue.next().value;
//     }
//   }
}
