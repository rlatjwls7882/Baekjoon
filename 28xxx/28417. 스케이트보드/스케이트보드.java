import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 사람의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 우승자의 최종점수 계산
        int maxScore=0;
        
        while(N--!=0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	// 런에서 받은 최고점수 계산
        	int runScore=0;
        	
        	for(int i=0;i<2;i++) {
        		int tmp = Integer.valueOf(st.nextToken());
        		
        		if(tmp>runScore) runScore=tmp;
        	}
        	
        	// 트릭 연기를 통해 받은 점수 중 상위 2개의 점수 계산
        	int[] trick = new int[5];
        	
        	for(int i=0;i<5;i++)
        		trick[i] = Integer.valueOf(st.nextToken());
        	
        	Arrays.sort(trick);
        	
        	// 최종점수 계산
        	if(maxScore<runScore+trick[3]+trick[4])
        		maxScore = runScore+trick[3]+trick[4];
        }
        
        // 우승자의 최종점수 출력
        bw.write(maxScore+"");
        bw.close();
    } // end of main
} // end of Main class