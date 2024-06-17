package java_practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6,1,2};
		Map<Integer,Integer> duplicates=new HashMap<>();
		for(int num:arr) {
			if(duplicates.containsKey(num)) {
				duplicates.put(num, duplicates.get(num)+1);
			}else
				
			duplicates.put(num, 1);
		}
		System.out.println(duplicates);
	}

}
