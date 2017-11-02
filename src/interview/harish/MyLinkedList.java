package interview.harish;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<Integer> extends LinkedList<Integer> implements MyList<Integer> {

	@Override
	public boolean add(Integer element){
		int exponent = element/10;
		int remainder =  element%10;
		add(exponent);
		return super.add(remainder);	
	}
	
	@Override
	public MyList<Integer> addLists(MyList<Integer> listToAdd) {
		
		
		List<Integer> finalList = null;
		if(null != listToAdd){
			int carryOver = 0;
			List<Integer> smaller,bigger = null;
			
			if(this.size() >= listToAdd.size()){
				smaller = listToAdd;
				bigger = this;
			}else{
				smaller = listToAdd;
				bigger = this;
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
		return finalList;
	}

}