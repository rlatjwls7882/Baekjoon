import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 백준이가 외치는 정수의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // front - back 순으로 정렬하여 front.peek()이 항상 중앙값을 가지게 함
        PriorityQueue<Integer> front = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> back = new PriorityQueue<Integer>();
        
        for(int i=1;i<=N;i++) {
        	
        	// 백준이가 말하는 정수 입력
        	int X = Integer.valueOf(br.readLine());
        	
        	// 홀수번째인 경우 front에 넣음
        	if(i%2==1) {
        		try {
        			
        			// 넣어야 하는 정수가 front의 최대값보다 큰 경우
        			if(front.peek()<X) {
        				back.add(X);
        				front.add(back.poll());
        			}
        			
        			else
        				front.add(X);
					
				} catch (Exception e) {
					
					// front에 아무것도 없는 경우
					front.add(X);
				}
        	}
        	
        	// 짝수번째인 경우 back에 넣음
        	else {
        		
        		// 넣어야 하는 정수가 front의 최대값보다 작은 경우
        		if(front.peek()>X) {
        			front.add(X);
        			back.add(front.poll());
        		}

        		else
        			back.add(X);
        	}
        	
        	// 백준이의 동생이 말해야하는 중앙값 출력
        	bw.write(front.peek()+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class