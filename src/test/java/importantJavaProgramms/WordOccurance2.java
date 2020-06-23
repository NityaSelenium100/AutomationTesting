package importantJavaProgramms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WordOccurance2 {

	public static void main(String[] args) {
		
		String str="I I LOVE LOVE LOVE INDIA INDIA INDIA";
		
		String[]eachword=str.split(" ");
		
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		
		for(String words:eachword) {
			
			if(hm.get(words)==null) {
				
				hm.put(words, 1);
			}else {
				
				hm.put(words, hm.get(words)+1);
			}
		}
		
		for(Entry<String, Integer> words:hm.entrySet()) {
			
			System.out.println("The word " + words.getKey() + " occures " + words.getValue() + " times");
		}

	}

}
