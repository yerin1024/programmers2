package com.lyr.programmers;

import com.lyr.programmers.level2.FunctionDevelopment;
import com.lyr.programmers.level2.Printer;

public class Main {

	public static void main(String[] args) {
		
//		FunctionDevelopment s = new FunctionDevelopment();
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
////		
////		int[] progresses = {99, 99, 99};
////		int[] speeds = {1, 1, 1};
//		s.solution(progresses, speeds);
		
		
		Printer s = new Printer();
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		s.solution(priorities, location);
	}

}
