import java.util.ArrayList;
import java.util.Iterator;

public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to project 1");

		GenericQueue<String> queue = new GenericQueue<String>("Hello");
		queue.enqueue("World");
		queue.enqueue("!");

		GenericIterator<String> myStackIterator = queue.GenericInterface();

		myStackIterator.descendingIterator();
		queue.print();
	}
}
