import java.util.ArrayList;
import java.util.Iterator;

// A class that implements a generic hash map using an ArrayList of GenericQueues
public class MyHashMap<T> {
  private ArrayList<GenericQueue<Node>> map; // ArrayList of GenericQueues to hold the key-value mappings

  // A Node class to hold the data and code fields for each key-value mapping
  class Node<T> {
    String data;
    T code;
    Node<T> next;
    
    // Default constructor
    public Node() {   
    }   

    // Constructor to set the data and code fields for a new node
    public Node(String data, T code) {
      this.data = data;
      this.code = code;
      this.next = null;
    }
  }
  // Constructor that initializes the ArrayList of GenericQueues and adds the initial key-value mapping 
  public MyHashMap(String key, T value) {
    map = new ArrayList<>(10);
    for (int i = 0; i < 10; i++) {
      Node node = new Node();
      map.add(new GenericQueue<>(node));
    }
    put(key, value);
  }

  // Method to add a new key-value mapping to the hash map
  public void put(String key, T value) {
    int index = key.hashCode() % 10;
    GenericQueue<Node> queue = map.get(index);
    Node node = new Node(key, value);
    queue.enqueue(node);
  }

  // Method to print all key-value mappings in the hash map
  public void print() {
    for (int i = 0; i < 10; i++) {
      GenericQueue<Node> queue = map.get(i);
      Iterator<Node> iterator = queue.GenericInterface();
      while (iterator.hasNext()) {
        Node node = iterator.next();
        if(node.data != null) {
          System.out.println(node.data + " " + node.code);
        }
      } 
    }
  }

  // Method to check if a key is present in the hash map
  public boolean contains(String key) {
    int index = key.hashCode() % 10;
    GenericQueue<Node> queue = map.get(index);
    Iterator<Node> iterator = queue.GenericInterface();
    while (iterator.hasNext()) {
      Node node = iterator.next();
      if(node.data != null) {
        if (node.data.equals(key)) {
          return true;
        }
      }
    }
    return false;
  }

  // Method to get the value associated with a given key in the hash map
  public T get(String key) {
    int index = key.hashCode() % 10;
    GenericQueue<Node> queue = map.get(index);
    Iterator<Node> iterator = queue.GenericInterface();
    while (iterator.hasNext()) {
      Node node = iterator.next();
      if (node.data != null) {
        if(node.data.equals(key)) {
          return (T) node.code;
        }
      }
    }
    return null;
  }

// Method to get the size of the hash map (i.e. number of key-value mappings)
public int size() {
  int size = 0;
  for (int i = 0; i < 10; i++) {
    GenericQueue<Node> queue = map.get(i);
    Iterator<Node> iterator = queue.GenericInterface();
    while (iterator.hasNext()) {
      Node node = iterator.next();
      if(node.data != null) {
        size++;
      }
    }
  }
  return size;
}

// Method to check if the hash map is empty
public boolean isEmpty() {
  if(size() == 0) {
    return true;
  }
return false;
}

  // Method to replace the value associated with a given key in the
 public T replace(String key, T value)
  {
    
    int index = key.hashCode() % 10;
    GenericQueue<Node> queue = map.get(index);
    Iterator<Node> iterator = queue.GenericInterface();
    while (iterator.hasNext()) 
    {
      Node node = iterator.next();
      if (node.data != null) 
      {
        if(node.data.equals(key))
        {
          T temp = (T) node.code;
          node.code = value;
          return temp;
        }
      }
    }
    return null;
  }
}