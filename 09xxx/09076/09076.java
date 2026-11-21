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
    	
    	// 테스트 케이스의 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		
    		// 5개의 점수 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int[] scores = new int[5];
    		
    		for(int i=0;i<5;i++)
    			scores[i] = Integer.valueOf(st.nextToken());
    		
    		// 총점 계산
    		Arrays.sort(scores);
    		
    		if(scores[3]-scores[1]>=4)
    			bw.write("KIN\n");
    		else
    			bw.write(scores[1]+scores[2]+scores[3]+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class