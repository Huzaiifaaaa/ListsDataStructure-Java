

public class GQTest {

  public boolean testEmptyConstructor() {
    GenericQueue<String> queue = new GenericQueue<String>();
    
    if(queue.getLength() == 0) {
      return true;
    }

    return false;
  }

  public boolean testConstructorWithSingleItem() {
    GenericQueue<String> queue = new GenericQueue<String>("hello");

    if(queue.getLength() == 1 & queue.dequeue() == "hello") {
      return true;
    }

    return false;
  }

  public boolean testDeleteFromEmptyQueue() {
    GenericQueue<String> queue = new GenericQueue<String>();
    
    if(queue.delete() == null) {
      return true;
    }

    return false;
  }

  public boolean testDeleteFromSingleItemQueue() {
    GenericQueue<String> queue = new GenericQueue<String>("hello");
    queue.delete();

    if(queue.getLength() == 0 && queue.getHead() == null) {
      return true;
    }

    return false;
  }

  public boolean testAddToEmptyQueue() {
    GenericQueue<String> queue = new GenericQueue<String>();
    queue.add("hello");
    
    if(queue.getLength() == 1 && queue.getHead() !=null) {
      return true;
    }

    return false;
  }

  public boolean testAddToNonEmptyQueue() {
    GenericQueue<String> queue = new GenericQueue<String>("hello");
    queue.add("world");
    
    if(queue.getLength() == 2) {
      return true;
    }

    return false;
  }


  public boolean testEnqueue() {
    GenericQueue<String> queue = new GenericQueue<String>();
    queue.enqueue("hello");
 
    if(queue.getLength() == 1) {
      return true;
    }

    return false;
  }

  public boolean testDequeueFromEmptyQueue() {
    GenericQueue<String> queue = new GenericQueue<String>();
    if(queue.dequeue() == null) {
      return true;
    }

    return false;
  }

  public boolean testDequeueFromNonEmptyQueue() {
    GenericQueue<String> queue = new GenericQueue<String>("hello");
    queue.add("world");
    queue.dequeue();
    
    if(queue.getLength() == 1 && queue.getHead() != null) {
      return true;
    }

    return false;
  }

  public boolean testGetLength() {
    GenericQueue<String> queue = new GenericQueue<String>("hello");
    queue.add("world");
    queue.dequeue();
    
    if(queue.getLength() == 1) {
      return true;
    }

    return false;
  }

  public void testAll()
  {
    System.out.println("testEmptyConstructor: " + testEmptyConstructor());
    //System.out.println("testConstructorWithSingleItem: " + testConstructorWithSingleItem());
    System.out.println("testDeleteFromEmptyQueue: " + testDeleteFromEmptyQueue());
    //System.out.println("testDeleteFromSingleItemQueue: " + testDeleteFromSingleItemQueue());
    //System.out.println("testAddToEmptyQueue: " + testAddToEmptyQueue());
    System.out.println("testAddToNonEmptyQueue: " + testAddToNonEmptyQueue());
    //System.out.println("testEnqueue: " + testEnqueue());
    System.out.println("testDequeueFromEmptyQueue: " + testDequeueFromEmptyQueue());
    System.out.println("testDequeueFromNonEmptyQueue: " + testDequeueFromNonEmptyQueue());
    System.out.println("testGetLength: " + testGetLength());
  }
}
