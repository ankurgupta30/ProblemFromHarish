package interview.harish;

public class MainClass {

	public static void main(String[] args) {
		MyList firstList = new MyLinkedList();
		firstList.add(2345);
		System.out.println("firstList " + firstList);
		firstList.displayAsNumber();
		
		MyList secondList = new MyLinkedList();
		secondList.add(987);
		System.out.println("\nsecondList " + secondList);
		secondList.displayAsNumber();
		
		MyList result = firstList.addLists(secondList);
		System.out.println("\nfinal Result" + result);
		result.displayAsNumber();
	}


}
