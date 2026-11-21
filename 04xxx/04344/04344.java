import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수 C 입력
    	int C = Integer.valueOf(br.readLine());
    	
    	while(C--!=0) {
    		
    		// 학생수 N, N명의 총점 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int sum=0;
    		int[] score = new int[N];
    		
    		for(int i=0;i<N;i++) {
    			score[i]=Integer.valueOf(st.nextToken());
    			sum+=score[i];
    		}
    		
    		// 평균을 넘는 학생의 수 계산
    		int stuNum=0;
    		
    		for(int i=0;i<N;i++)
    			if(score[i]>sum/(double)N)
    				stuNum++;
    		
    		// 평균을 넘는 학생의 비율 출력
    		bw.write(String.format("%.3f", stuNum/(double)N*100)+"%\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class