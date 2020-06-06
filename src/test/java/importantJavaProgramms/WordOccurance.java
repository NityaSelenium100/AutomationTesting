package importantJavaProgramms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WordOccurance {
	
	public static void main(String[] args) {
		
		String str="I I I Love Love Love India India India India";
		
		String[] words=str.split(" ");
		
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		
		for(String eachword:words) {
			
			if(hm.get(eachword)==null) {
				
				hm.put(eachword, 1);
			}else {
				hm.put(eachword, hm.get(eachword)+1);
			}
		}
		
		for(Entry<String, Integer> entry: hm.entrySet()) {
			
			System.out.println("The Word " + entry.getKey() + " Occures " + entry.getValue() + " times");
		}
		
		
		
	}

}
