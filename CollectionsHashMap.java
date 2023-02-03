package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsHashMap {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Omkar");
		hm.put(2, "Srishti");
		hm.put(3, "Seema");
		hm.put(4, "Reshma");
		hm.put(5, "Ketki");
		
		System.out.println(hm);
		System.out.println(hm.get(5));
		
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e.getValue() +" "+e.getKey() );
			
		}
		

		HashMap<Integer, String > data = new HashMap<>();
		
		data.put(1, "Omkar");
		data.put(2, "Seema");
		data.put(3, "Yuga");
		data.put(4, "Reshma");
		data.put(5, "Srishti");
		data.put(6, "Amit");
		
		System.out.println(data);
		
		for(Map.Entry<Integer, String> em : data.entrySet()) {
			System.out.println(em.getKey()+" "+em.getValue());
		}
		
		List<java.util.Map.Entry<Integer, String>> list= new ArrayList<java.util.Map.Entry<Integer,String>>(data.entrySet());
		
		List<java.util.Map.Entry<Integer,String>> DescOrder =list.stream().sorted((o1,o2)->o2.getKey()-o1.getKey()).collect(Collectors.toList());
		
		System.out.println(DescOrder);
		
		List<java.util.Map.Entry<Integer, String>> AscOrder = list.stream().sorted((o1,o2)->o1.getKey()-o2.getKey()).collect(Collectors.toList());
		
		System.out.println(AscOrder);
		
		List<java.util.Map.Entry<Integer, String>> DescOrderByName = list.stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());
		
		System.out.println();
		
		String s = "Omkar";
		String s1 = "Amit";
		
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);

		
		
	}

}
