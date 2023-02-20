import java.util.ArrayList;
import java.util.Iterator;

public class GLProject {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Welcome to project 1");
	
    //GenericQueue class
    //GenericQueue<String> gq = new GenericQueue<String>("Hello");
    // gq.enqueue("World");
    // gq.enqueue("!");
    // System.out.println(gq.dequeue());
    // gq.print();

    //MyHashMap class
    //MyHashMap<String> mhm = new MyHashMap<String>("a","A");
    // mhm.put("b","B");
    // mhm.put("c","C");
    // System.out.println(mhm.contains("b"));
    // System.out.println(mhm.contains("c"));
    // System.out.println(mhm.get("a"));
    // System.out.println(mhm.size());
    // System.out.println(mhm.isEmpty());
    // System.out.println(mhm.replace("a","D"));
    // mhm.print();

    //for testing the GenericQueue, GenericList, and GenericNode classes
    System.out.println("\nTesting GenericList class");
    GQTest gq = new GQTest();
    gq.testAll();

    //for testing the MyHashMap class
    System.out.println("\nTesting MyHashMap class");
    HMTest mhm = new HMTest();
    mhm.testAll();

  }
}
