package lesson140703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncDataHolders {

	// Java 1.0
	
	// Thread-safe
	Vector v = new Vector();
	Hashtable table = new Hashtable();
	
	// Java 1.2
	
	// Not Thread-Safe
	List<String> list = new ArrayList<String>();
	Map<String, String> map = new HashMap<String, String>();
	
	synchronized(map) {
		if(!map.containsKey("Pete")) {
			// <----- some other thread changed map here
			map.put("Pete", "New-York");
		}
	}
	
	// Thread-Safe
	List<String> syncList = Collections.synchronizedList(list);
	Map<String, String> syncMap = Collections.synchronizedMap(map);
	
	// Java 1.5: Thread-Safe, Efficient
	List<String> concurrentList = new CopyOnWriteArrayList<>();
	
	Queue<String> queue = new ConcurrentLinkedQueue<>();
	
	ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
}
