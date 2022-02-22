package com.lyr.programmers.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 2022년 2월 22일 (화요일)
 * 5. 문자열 압축
 */
public class StringCompression {
    public int solution(String s) {
        int answer = 0;
        Map<Integer, Integer> resultMap = new HashMap<>();
        if(s.length()>1) {
	        for(int i=1; i<s.length(); i++) { //1글자씩부터~전체길이를 하나로
	        	String result = "";
	        	String before = "";
	        	int beforeCnt = 0;
	        	
	        	for(int j=0; j<Math.ceil((double)s.length()/i); j++) {
	        		String now = "";
	        		if(j*i+i > s.length()) {
	        			now = s.substring(j*i, s.length()); 
	        			
        				result+=before+now; //남은 글자 전부 더해줌
	        		} else {
	        			now = s.substring(j*i, j*i+i);
	        			
	            		if(before=="") { //제일 처음
	            			before = now;
	            			beforeCnt++;
	            		} else {
	            			if(before.contentEquals(now)) {
	            				beforeCnt++;
	            			} else {
	            				if(beforeCnt!=1) {
	            					result+=beforeCnt;
	            				}
	            				result+=before;
	            				beforeCnt = 1;
	            				before = now;
	            			}
	
	        				if(j == s.length()/i-1) {
	        					if(beforeCnt!=1) {
	            					result+=beforeCnt;
	            				}
	            				result+=before;
	            				before="";
	        				}
	            		}
	        		}
	        	}
	        	System.out.println("result = "+result+" = "+result.length());
	        	
	        	resultMap.put(i, result.length());
	        }
	        
	        Set<Integer> keySet = resultMap.keySet();
	        int min = 0;
	        int minKey = 0;
	        for(int key : keySet) {
	        	if(min == 0) {
	        		minKey = key;
	        		min = resultMap.get(key);
	        	} else {
	        		if(min>resultMap.get(key)) {
		        		minKey = key;
	        			min = resultMap.get(key);
	        		} else if (min == resultMap.get(key)) { //aaaaaaaaaa-> 10a(1글자씩), 5a(2글자씩)
	        			if(minKey>key) {
	        				minKey = key;
		        			min = resultMap.get(key);
	        			}
	        		}
	        	}
	        }
	        answer = min;
        } else {
        	answer = s.length();
        }
        System.out.println(answer);
        return answer;
    }
}
