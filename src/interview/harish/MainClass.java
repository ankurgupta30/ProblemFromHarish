package interview.harish;

public class MainClass {

	public static void main(String[] args) {
		MyList firstList = new MyLinkedList();
		firstList.add(2345);
		System.out.println("firstList " + firstList);
		MyList secondList = new MyLinkedList();
		secondList.add(987);
		System.out.println("secondList " + secondList);
		
		MyList result = firstList.addLists(secondList);
		System.out.println("final Result" + result);
		
	}

	/*private void testUseCase(){
		List<Integer> firstList = getFirstList();
		List<Integer> secondList = getSecondList();
		List<Integer> finalList = null;
		if(null != firstList && null != secondList){
			int carryOver = 0;
			List<Integer> smaller,bigger = null;
			
			if(firstList.size() >= secondList.size()){
				smaller = secondList;
				bigger = firstList;
			}else{
				smaller = secondList;
				bigger = firstList;
			}
			
			finalList = new ArrayList(bigger.size());
			int smallerListSize =  smaller.size();
			for (int index=0; index<bigger.size(); index++){
				if(smallerListSize > index){
				int sum = bigger.get(index) + smaller.get(index)+ carryOver; 
				finalList.add(sum%10);
				carryOver = sum /10;
				}else if (carryOver != 0 ) {
					int sum = bigger.get(index) + carryOver; 
					finalList.add(sum%10);
					carryOver = sum /10;
				}else{
					break;
				}
			}
			
			
					
		}
		if(null != finalList){
			System.out.println("final List " + finalList);
		}
		
	}

	private List getSecondList() { 
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(8);
		list.add(7);
		
		return list;
	}

	private List getFirstList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(2);
		return list;
	}*/
}