package com.lyr.programmers.level2;

/*
 * 2022년 2월 21일 (화요일)
 * 4. 타겟 넘버
 */
public class TargetNumber {
	//다른 사람 풀이 참고(DFS)
	static int answer;
    
    public int solution(int[] numbers, int target) {	
    	
    	//1. answer은 전역변수로 선언
    	answer = 0;
    	
    	//2. dfs 수행
    	dfs(numbers, 0, target, 0);
    	
    	System.out.println(answer);
        return answer;
    }
    
    //depth = 현재 몇번째 인덱스인지, sum = 현재 idx까지 누적된 값
    public void dfs(int[] numbers, int depth, int target, int sum) { 
    	//4. 모든 정수를 탐색했을 때,
    	if(depth == numbers.length) {
    		//5. 누적합이 target과 동일하면 answer++ 후 메소드 종료 
    		if(sum == target) {
    			answer++;
    		}

			return;
    	}
    	
    	//6. 현재 인덱스의 정수를 +로 합해준다
    	sum += numbers[depth];
    	//7. 다음 인덱스 dfs 수행
    	dfs(numbers, depth+1, target, sum);
    	
    	//8. 6의 값을 다시 빼준 뒤,
    	sum -= numbers[depth];
    	//9. 현재 인덱스의 정수를 -로 합해준다
    	sum += (-1*numbers[depth]);
    	//10. 다시 다음 인덱스 dfs 수행
    	dfs(numbers, depth+1, target, sum);
    	
    }
}
