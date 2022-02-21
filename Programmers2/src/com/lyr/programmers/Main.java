package com.lyr.programmers;

import com.lyr.programmers.level2.FunctionDevelopment;
import com.lyr.programmers.level2.PhoneNumberList;
import com.lyr.programmers.level2.Printer;
import com.lyr.programmers.level2.TargetNumber;

public class Main {

	public static void main(String[] args) {
		
//		FunctionDevelopment s = new FunctionDevelopment();
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
////		
////		int[] progresses = {99, 99, 99};
////		int[] speeds = {1, 1, 1};
//		s.solution(progresses, speeds);
		
		
//		Printer s = new Printer();
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		
////		int[] priorities = {1, 1, 9, 1, 1, 1};
////		int location = 0;
//		
////		int[] priorities = {1, 1, 1, 1};
////		int location = 2;
//		s.solution(priorities, location);
		
//		PhoneNumberList s = new PhoneNumberList();
////		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"125", "1236", "12"};
//		s.solution(phone_book);
		
		TargetNumber s = new TargetNumber();
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
//		int[] numbers = {4, 1, 2, 1};
//		int target = 4;
		
		s.solution(numbers, target);
	}

}
