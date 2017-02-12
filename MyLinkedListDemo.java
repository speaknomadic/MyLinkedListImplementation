package myLinkedListImplementation;

public class MyLinkedListDemo {
	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		myList.add("Kiro");
		myList.add("Silva");
		myList.add("Acho");
		myList.add("Kiro");
		myList.add("Silva");
		// myList.add("Acho",0);
		// myList.add("Magi",2);
		// myList.add("Zhana",4);
		// myList.add("Zhana",0);
		//
		// for(int i=0;i<myList.size();i++)
		// {
		// System.out.println(myList.get(i));
		// }
		// System.out.println(myList.size());
		// myList.remove(2);
		//
		// for(int i=0;i<myList.size();i++)
		// {
		// System.out.println(myList.get(i));
		// }
		// System.out.println(myList.size());
		// myList.remove(0);
		//
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println(myList.size());

	}
}
