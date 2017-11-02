package interview.harish;

import java.util.List;

public interface MyList<Integer> extends List<Integer> {

	MyList<Integer> addLists(MyList<Integer> listToAdd);
	
}
