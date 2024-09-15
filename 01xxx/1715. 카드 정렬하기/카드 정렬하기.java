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
        
        // 카드 묶음의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 카드 묶음 각각의 크기 입력
        PriorityQueue<Integer> size = new PriorityQueue<Integer>();
        
        for(int i=0;i<N;i++)
        	size.add(Integer.valueOf(br.readLine()));
        
        // 카드묶음 비교 횟수 계산
        int sum=0;
        
        if(N>1)
        	for(int i=1;i<size.size();) {
        		
        		// 하나가 남을 때까지 제일 작은 두 수의 합 계산
        		int tmp = size.poll() + size.poll();
        		
        		size.add(tmp);
        		sum += tmp;
        	}
        
        // 카드 묶음이 한개만 있을때
        else
        	sum=0;
        
        // 비교 횟수 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class