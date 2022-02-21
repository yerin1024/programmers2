package com.lyr.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 2022년 2월 21일 (월요일)
 * 1. 기능개발
 */
public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=0; i<progresses.length; i++) {
        	int progress = 100-progresses[i];
        	int time = (int) Math.ceil(progress/speeds[i]);
        	
        	System.out.print(time+" ");
        	queue.add(time);
        }
        System.out.println();
        while(!queue.isEmpty()) {
        	int cnt = 1;
        	int top = queue.poll();
        	System.out.println("======"+top);
        	
        	if(!queue.isEmpty()) {
        		System.out.println(queue.peek());
	        	while(queue.peek() <= top) {
	        		queue.poll();
	        		cnt++;
	        		if(queue.isEmpty()) {
	        			break;
	        		}
	        	}
        	}
        	answerList.add(cnt);
        	System.out.println(cnt);
        }
        
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}

/*
Queue만들 때 왜 LinkedList를 써야할까?
큐의 구조는 한쪽에서는 삽입만 일어나고 한쪽에서는 삭제만 하는 자료구조 입니다. 즉, 먼저 들어간 것이 먼저 나오는 FIFO 구조입니다. (예시로는 줄서기, 프린터 출력 같은 것이 있습니다.)
즉, 큐는 항상 첫 번재 저장된 데이터를 삭제하므로, ArrayList와 같은 배열 기반의 자료구조를 사용하게 되면 빈공간을 채우기 위해서 데이터의 복사가 발생하므로 매우 비효율적입니다.
그래서 Queue는 ArrayList보다 데이터의 추가/삭제가 쉬운 LinkedList로 구현하는 것이 적합합니다.

queue.offer(1); ->값을 넣어줌
queue.poll(); ->맨 앞의 값을 꺼냄
queue.peek(); ->값을 꺼내지 않고 맨 앞의 값 확인
*/

/*
ArrayList와 LinkedList
ArrayList
- 읽기는 빠르고 추가/삭제는 느림
- 비효율적인 메모리 사용 (기본사이즈가 10, 사이즈 부족하면 복사해서 더 큰 사이즈로 이동)
LinkedList
- 읽기는 느리고 추가/삭제는 빠름
- 데이터가 많을 수록 접근성 떨어짐

1. 순차적으로 추가하기
ArrayList : 순차적으로 추가하면 배열 원소들의 이동이 없이 추가만 하면 되기 때문에 쉽게 할 수 있습니다.
LinkedList : LinkedList는 순차적으로 추가하면 그 추가하고자 하는 곳으로 계속 탐색해서 가야 합니다. 하지만 내부적으로 양방향으로 되어 있기 때문에 ArrayList와 큰 차이가 나지는 않습니다.

2. 순차적으로 삭제하기
ArrayList : 순차적으로 마지막 원소를 삭제할 때는 원소들의 이동이 필요 없기 때문에 시간이 오래 걸리지 않습니다.
LinkedList : LinkedList는 내부적으로 양방향 연결리스트로 되어 있기 때문에 ArrayList와 큰 차이가 없는 것을 볼 수 있습니다.

3. 중간에 추가하기
ArrayList : 중간에 추가하게 되면 빈 공간을 만들어야 하기 때문에 원소들의 이동이 필요하기 때문에 상당히 비효율적입니다.
LinkedList : 중간에 추가할 때는 추가하고자 하는 원소 앞 or 노드로 가서 가리키고 있는 주소만 추가해주면 되기 때문에 금방 할 수 있습니다.

4. 중간에 삭제하기
ArrayList : 중간에서 삭제하는 것도 마찬가지로 중간에 빈 공간이 생기기 때문에 채우기 위해서 원소들의 이동이 일어나므로 시간이 오래 걸립니다.
LinkedList : 중간에서 삭제하는 것도 추가하는 것과 마찬가지의 과정입니다.

순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.
*/