package Cache;

import java.util.Date;

public class Key<K> {
	long lastReadingTime;
	K key;
	public Key(K key){
		this.key = key;
		
	}

	public void updateTime(){
		lastReadingTime = new Date().getTime();
		
	}
	public long getTime(){
		return lastReadingTime;
		
	}
}
