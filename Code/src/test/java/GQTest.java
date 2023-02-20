import java.util.ArrayList;
import java.util.Iterator;

public class GQTest {

  //testing dumpList
  public String testDumpList() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //create an ArrayList to compare to the output of dumpList
    ArrayList<String> input = new ArrayList<String>();
    input.add("a");//add a to the ArrayList
    input.add("b");
    input.add("c");
    ArrayList<String> output = gq.dumpList();//create an ArrayList to compare to the output of dumpList

    if (input.size() == output.size()) {//check if the size of the two ArrayLists are the same
      for (int i = 0; i < input.size(); i++) {
        if (!input.get(i).equals(output.get(i))) {
          return "Fail";//if the two ArrayLists are not the same, return "Fail"
        }
      }
      return "Pass";//if the two ArrayLists are the same, return "Pass"
    }

    return "Fail";//if the two ArrayLists are not the same, return "Fail"
  }

  //testing add
  public String testGet() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //check if the first element in the queue is "a", the second element is "b", and the third element is "c"
    if (gq.get(0).equals("a") && gq.get(1).equals("b") && gq.get(2).equals("c")) {
      return "Pass";//if the first element in the queue is "a", the second element is "b", and the third element is "c", return "Pass"
    }

    return "Fail";//if the first element in the queue is not "a", the second element is not "b", and the third element is not "c", return "Fail"
  }

  //testing set
  public String testSet() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //set the first element in the queue to "d", the second element to "e", and the third element to "f"
    gq.set(0, "d");
    gq.set(1, "e");
    gq.set(2, "f");

    //check if the first element in the queue is "d", the second element is "e", and the third element is "f"
    if (gq.get(0).equals("d") && gq.get(1).equals("e") && gq.get(2).equals("f")) {
      return "Pass";//if the first element in the queue is "d", the second element is "e", and the third element is "f", return "Pass"
    }

    return "Fail";//if the first element in the queue is not "d", the second element is not "e", and the third element is not "f", return "Fail"
  }

  //testing getLength
  public String testGetLength() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //check if the length of the queue is 3
    if (gq.getLength() == 3) {
      return "Pass";//if the length of the queue is 3, return "Pass"
    }

    return "Fail";//if the length of the queue is not 3, return "Fail"
  }

  //testing setLength
  public String testSetLength() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    gq.setLength(2);//set the length of the queue to 2

    //check if the length of the queue is 2
    if (gq.getLength() == 2) {
      return "Pass";//if the length of the queue is 2, return "Pass"
    }

    return "Fail";//if the length of the queue is not 2, return "Fail"
  }

  //testing getHead
  public String testGetHead() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //check if the head of the queue is "a"
    if (gq.getHead().data.equals("a")) {
      return "Pass";//if the head of the queue is "a", return "Pass"
    }

    return "Fail";//if the head of the queue is not "a", return "Fail"
  }

  //testing setHead
  public String testSetHead() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //set the head of the queue to "d"
    gq.setHead(gq.getHead().next.next);

    //check if the head of the queue is "c"
    if (gq.getHead().data.equals("c")) {
      return "Pass";//if the head of the queue is "c", return "Pass"
    }

    return "Fail";//if the head of the queue is not "c", return "Fail"
  }

  //testing delete
  public String testDelete() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //check if the tail of the queue is "c"
    String data = gq.delete();
    data = gq.delete();

    //check if the tail of the queue is "b"
    if (gq.getLength() == 1) {
      return "Pass";//if the tail of the queue is "b", return "Pass"
    }

    return "Fail";//if the tail of the queue is not "b", return "Fail"
  }

  //testing Add
  public String testAdd() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //check if the nodes are added to the queue
    if (gq.get(0).equals("a") && gq.get(1).equals("b") && gq.get(2).equals("c")) {
      return "Pass";//if the tail of the queue is "c" & node is added, return "Pass"
    }

    return "Fail";//if the tail of the queue is not "c", return "Fail"
  }

  //testing Enqueue
  public String testEnqueue() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.enqueue("b");//add b to the queue
    gq.enqueue("c");

    //check if the tail of the queue is "c"
    if (gq.get(0).equals("a") && gq.get(1).equals("b") && gq.get(2).equals("c")) {
      return "Pass";//if match, return "Pass"
    }

    return "Fail";//if not match, return "Fail"
  }

  //testing Dequeue
  public String testDequeue() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.enqueue("b");//add b to the queue
    gq.enqueue("c");

    //dequeue the last element in the queue
    String data = gq.dequeue();
    data = gq.dequeue();

    //check if the length has decreased
    if (gq.getLength() == 1) {
      return "Pass";//if the length has decreased, return "Pass"
    }

    return "Fail";//if the length has not decreased, return "Fail"
  }

  //testing Constructor
  public String testConstructorGenericQueue() {
    //create a new GenericQueue
    GenericQueue<String> queue = new GenericQueue<String>();

    //check if the length of the queue is 0
    if (queue.getLength() == 0) {
      return "Pass";//if the length of the queue is 0, return "Pass"
    }

    return "Fail";//if the length of the queue is not 0, return "Fail"
  }

  //testing descendingIterator
  public String testDescendingIterator() {
    //create a new GenericQueue
    GenericQueue<String> gq = new GenericQueue<String>("a");
    gq.add("b");//add b to the queue
    gq.add("c");

    //create a new iterator
    Iterator<String> it = gq.GenericInterface();

    //check if the iterator is descending
    if (it.next().equals("a") && it.next().equals("b") && it.next().equals("c")) {
      return "Pass";//if the iterator is descending, return "Pass"
    }

    return "Fail";//if the iterator is not descending, return "Fail"
  }


  //funciton to call all the test functions
  public void testAll() {
    System.out.println("testDumpList: " + testDumpList());
    System.out.println("testGet: " + testGet());
    System.out.println("testSet: " + testSet());
    System.out.println("testGetLength: " + testGetLength());
    System.out.println("testSetLength: " + testSetLength());
    System.out.println("testGetHead: " + testGetHead());
    System.out.println("testSetHead: " + testSetHead());
    System.out.println("testDelete: " + testDelete());
    System.out.println("testAdd: " + testAdd());
    System.out.println("testEnqueue: " + testEnqueue());
    System.out.println("testDequeue: " + testDequeue());
    System.out.println("testDescendingIterator: " + testDescendingIterator());
    System.out.println(
      "testConstructorGenericQueue: " + testConstructorGenericQueue()
    );
  }
}
