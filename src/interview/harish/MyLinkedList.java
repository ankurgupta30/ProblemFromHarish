package interview.harish;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList extends LinkedList<Integer> implements MyList {


	@Override
	public boolean add(Integer value){
		int exponent = value/10;
		int remainder =  value%10;
		if(exponent !=0)
			add(exponent);
		return super.add(remainder);	
	}
	
	@Override
	public MyList addLists(MyList listToAdd) {
		
		
		MyList finalList = null;
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
			
			finalList = new MyLinkedList();
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
		return finalList;
	}


}