package demoInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import demoInterface.Remote.Battery;

//nested interface inside interface
//A nested interface can be:
//Public or private (if inside a class)
//Always public (if inside another interface)

interface Remote {
	void press();
	
	interface Battery {
		void charge();
	}
}


class TVRemote implements Remote{
	public void press() {
		System.out.println("TV Turned on");
	}
}

class DuraCell implements Battery{
	public void charge() {
		System.out.println("Battery charging");
	}
}


public class A_06_NestedInterface {

	public static void main(String[] args) {
		Remote remote = new TVRemote();
		remote.press();
		
		Remote.Battery battery = new DuraCell();
		battery.charge();
		
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a",101);
		map.put("b",102);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}


