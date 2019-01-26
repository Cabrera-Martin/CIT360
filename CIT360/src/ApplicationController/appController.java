package ApplicationController;

import java.util.HashMap;

public class appController  {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> mapNames=new HashMap<Integer, String>();
		
		mapNames.put(1, "Martin");
		mapNames.put(2, "Joe");
		mapNames.put(3, "Tim");
		mapNames.put(4, "Isaac");
		mapNames.put(5, "Michael");
		
		System.out.println(mapNames);
	}

}
