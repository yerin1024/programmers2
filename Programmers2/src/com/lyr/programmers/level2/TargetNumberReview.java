package com.lyr.programmers.level2;

//4. 타겟 넘버 복습
public class TargetNumberReview {
	static int answer;

	public int solution(int[] numbers, int target) {
//		 int[] numbers = {1, 1, 1, 1, 1};
//		 int target = 3; //5		 

		dfs(0, 0, numbers, target);
		System.out.println(answer);
		
		return answer;
	}
	
	public void dfs(int depth, int sum, int[] numbers, int target) { //재귀함수를 이용한 dfs
		
		if(depth == numbers.length) {
			if(sum == target) {
				answer++;
			}
			
			return;
		}
		
		//양의 정수로 더함
		sum += numbers[depth];
		dfs(depth+1, sum, numbers, target);
		
		//음의 정수로 더함
		sum -= numbers[depth];
		sum += (-1*numbers[depth]);
		dfs(depth+1, sum, numbers, target);
	}
}
