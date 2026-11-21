import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트케이스 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		// 층수 k, 호수 n 입력
    		int k = Integer.valueOf(br.readLine());
    		int n = Integer.valueOf(br.readLine());
    		
    		// i층의 거주민 수
    		int[] room = new int[n];
    		
    		// 0층 거주민 수 입력
    		for(int i=0;i<n;i++)
    			room[i]=i+1;
    		
    		// 1~k층 거주민 수 입력
    		for(int i=1;i<=k;i++)
    			for(int j=1;j<n;j++)
    				
    				// 왼쪽 집과 아랫집 거주민 수의 합 계산
    				room[j]= room[j-1]+room[j];
    		
    		// k층 n호 거주자 출력
    		bw.write(room[n-1]+"\n");
    	}

    	bw.close();
    } // end of main
} // end of Main class