package com.lyr.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * 2022년 2월 21일 (월요일)
 * 3. 전화번호 목록
 */
public class PhoneNumberList {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        
        //내가 푼 방식 ->효율성 테스트 3,4 탈락
//        for(int j=0; j<phoneBook.length; j++) {
//        	System.out.println(phoneBook[j]);
//        }
//        
//        for(int i=0; i<phoneBook.length-1; i++) {
//        	for(int j=i+1; j<phoneBook.length; j++) {
//            	String longStr = phoneBook[j];
//            	String shortStr = phoneBook[i];
//            	System.out.println(shortStr + "   &&   " + longStr);
//            	
//            	if(phoneBook[i].length() > phoneBook[j].length()) {
//            		longStr = phoneBook[i];
//            		shortStr = phoneBook[j];
//            	}
//            	System.out.println(longStr.substring(0, shortStr.length()));
//            	if(longStr.substring(0, shortStr.length()).contentEquals(shortStr)) {
//        			System.out.println("하나라도 접두어");
//        			answer = false;
//        			break;
//        		}
//        	}
//        	if(!answer) {
//        		break;
//        	}
//        }
        
        //다른 사람 풀이 참고
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<phoneBook.length; i++) {
        	map.put(phoneBook[i], i);
        }
        
        for(int i=0; i<phoneBook.length; i++) {
        	for(int j=0; j<phoneBook[i].length(); j++) {
        		if(map.containsKey(phoneBook[i].substring(0, j))) {
        			answer = false;
        		}
        	}
        }
        System.out.println("answer = "+answer);
        return answer;
    }
}

/*
Pattern p = Pattern.compile(phoneBook[j]);
Matcher m = p.matcher(phoneBook[j]);
m.find(); :pattern에 일치하는 텍스트들이 발견되면 true 리턴, 반복문을 통해 두번째, 세번째로 패턴과 일치하는 부분도 찾을 수 있음
m.match(); : 주어진 텍스트 전체와 패턴이 일치하는 경우 true 리턴
*/