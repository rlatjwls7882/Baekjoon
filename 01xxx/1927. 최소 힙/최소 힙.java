import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 연산의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        while(N--!=0) {
        	
        	// 정수 x 입력
        	int x = Integer.valueOf(br.readLine());
        	
        	// 0이 입력되는 경우
        	if(x==0) {
        		
        		if(heap.isEmpty())
        			bw.write("0\n");
        		else
        			bw.write(heap.poll()+"\n");
        	}
        	
        	// 0이 입력되지 않는 경우
        	else
        		heap.offer(x);
        }
        
        bw.close();
    } // end of main
} // end of Main class