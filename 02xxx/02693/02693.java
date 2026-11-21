import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 10개의 원소를 내림차순으로 입력
        	PriorityQueue<Integer> PriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	for(int i=0;i<10;i++)
        		PriorityQueue.add(Integer.valueOf(st.nextToken()));
        	
        	// 3번째 큰 값 출력
        	PriorityQueue.poll(); PriorityQueue.poll();
        	bw.write(PriorityQueue.poll()+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class