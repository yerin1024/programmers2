package com.lyr.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 2022년 2월 21일 (월요일)
 * 2. 프린터
 */
public class Printer {
	 public int solution(int[] priorities, int location) {
	        int answer = 0;
	        int order = 0;

	        Queue<Integer> queue = new LinkedList<>();
	        
	        for(int i=0; i<priorities.length; i++) {
	        	queue.add(i);
	        }
	        
	        while(!queue.isEmpty()) {
	        	int currentIndex = queue.peek();
	        	System.out.println("currentIndex = "+currentIndex);
	        	for(int j=0; j<priorities.length; j++) {
	        		System.out.println(j+" && "+priorities[currentIndex] +" && "+ priorities[j]);
	        		if(priorities[currentIndex] < priorities[j]) {
	        			queue.add(queue.poll());
	        			break;
	        		} 
	        		
	        		if(j == priorities.length-1) {
	        			priorities[currentIndex] = 0;
	            		queue.poll();
	            		order++;
	            		if(location == currentIndex) {
	            			answer = order;
	            			queue.clear();
	            			break;
	            		}
	        		}
	        	}
	        	
        		
	        }
	        
	        
	        System.out.println("answer = "+answer);
	        return answer;
	 }
}
