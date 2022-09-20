package problems;

import java.util.ArrayList;
import java.util.TreeSet;

public class Problem1 {
	public int input(int A, int B, int C, int D) {
		int result = 0;
		
		TreeSet <Integer> set = new TreeSet<>();
		set.add(B);
		set.add(C);
		set.add(D);
		ArrayList<Integer> list = new ArrayList<>();
		for(int num: set) {
			list.add(num);
		}
		int index = list.size()-2;
		result = list.get(index);
		return result;
	}
}
