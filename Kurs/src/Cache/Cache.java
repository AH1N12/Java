package Cache;

import java.util.HashMap;
import java.util.Map;

//metoda odczytujaca przypisuje wartosci date odczytania a watek budzi sie i patrzy czy od odczytania minelo > 10 sec
public class Cache<K, V> {
	Map<K, V> myMap = new HashMap<>();

	int operacjadokeszowania(int parametrint, String parametrstr) {
		// symulacja dlugiej metody
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		return parametrint + parametrstr.length();
	}

	V getValue(K key) {

		if (myMap.containsKey(key)) {
			return myMap.get(key);
		} else {
			// uaktualnij cache'a
			return veryLongComputing(key);

		}

	}

	V veryLongComputing(K key) {
		System.out.println("Result of very long computing for key" + key.toString());
		return null;
	}

}
