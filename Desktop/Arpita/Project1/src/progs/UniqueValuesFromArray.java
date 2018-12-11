package progs;

import java.util.Set;
import java.util.TreeSet;

public class UniqueValuesFromArray {

	public static void main(String[] args) {
		
		int arr[] = {0,0,0,1,2,1,0,3,4,5,5,5,4,6,7,8,};
		Set<Object> set = new TreeSet<>();
		for ( int i : arr){
			set.add(i);
		}
		System.out.println(set);
	}
}
