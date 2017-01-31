package FILO;

import java.util.ArrayList;
import java.util.List;

public class FILO<T> {
	private List<T> myList = new ArrayList<T>();

	public T GetELement() {
		if (myList.isEmpty()) {
			return null;
		}
		T tmp = myList.get(myList.size() - 1);
		myList.remove(myList.size() - 1);
		return tmp;
	}

	public void add(T t) {
		myList.add(t);
	}

}
