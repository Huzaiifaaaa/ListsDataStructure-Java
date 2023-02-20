import java.util.ArrayList;
import java.util.Iterator;

public class HMTest {

  public String testPut() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    if (mhm.get("a") == "A" && mhm.get("b") == "B" && mhm.get("c") == "C") {
      return "Pass";
    }

    return "Fail";
  }

  public String testGet() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    if (mhm.get("a") == "A" && mhm.get("b") == "B" && mhm.get("c") == "C") {
      return "Pass";
    }

    return "Fail";
  }

  public String testContains() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    if (mhm.contains("a") && mhm.contains("b") && mhm.contains("c")) {
      return "Pass";
    }

    return "Fail";
  }

  public String testSize() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    if (mhm.size() == 3) {
      return "Pass";
    }

    return "Fail";
  }

  public  String testIsEmpty() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    if (!mhm.isEmpty()) {
      return "Pass";
    }

    return "Fail";
  }

  public String testReplace() {
    MyHashMap<String> mhm = new MyHashMap<String>("a", "A");
    mhm.put("b", "B");
    mhm.put("c", "C");

    mhm.replace("a", "D");
    mhm.replace("b", "E");
    mhm.replace("c", "F");

    if (mhm.get("a") == "D" && mhm.get("b") == "E" && mhm.get("c") == "F") {
      return "Pass";
    }

    return "Fail";
  }

  public void testAll() {
    System.out.println("testPut: " + testPut());
    System.out.println("testGet: " + testGet());
    System.out.println("testContains: " + testContains());
    System.out.println("testSize: " + testSize());
    System.out.println("testIsEmpty: " + testIsEmpty());
    System.out.println("testReplace: " + testReplace());
  }
}
