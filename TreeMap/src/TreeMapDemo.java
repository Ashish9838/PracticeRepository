import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm1=new TreeMap();
		System.out.println("TRY");
		TreeMap<Integer,String> tm2=new TreeMap<Integer,String>();
		//TreeMap<Integer,String>tm2=new TreeMap<Integer,String>();
		tm1.put(3, "Ashish");
		tm1.put(2,"Shubham");
		tm1.put(1,"Ram");
		
		//operations on genric types
		
		tm2.put(3,"VARANASI");
		tm2.put(2,"TO");
		tm2.put(1,"WELCOME");
		
		System.out.println(tm1);
		System.out.println(tm2);
		
		//Changing elements of the list
		System.out.println("========After updating the elemient==========");
		tm2.put(3,"MUMBAI");
		System.out.println(tm2);
		
		//removing elements from the list
		System.out.println("=====After removing elements from the list=====");
		tm1.remove(3);
		System.out.println(tm1);
		
		
		//Itterating through TreeMap
		System.out.println("=======Itterating through TreeMap======");
		for(Map.Entry mapElement: tm2.entrySet()){
			int key=(int)mapElement.getKey();
			
			//finding the value
			String value=(String)mapElement.getValue();
			System.out.println(key+" : "+ value);
		}
		
		//Itterating through TreeMap
				System.out.println("=======Itterating through TreeMap======");
				for(Map.Entry mapElement: tm1.entrySet()){
					int key=(int)mapElement.getKey();
					
					//finding the value
					String value=(String)mapElement.getValue();
					System.out.println(key+" : "+ value);
					

				}
		
	}}

