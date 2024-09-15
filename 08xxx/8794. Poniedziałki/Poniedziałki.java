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
        
        // 테스트 케이스의 수 Z 입력
        int Z = Integer.valueOf(br.readLine());
        
        while(Z-->0) {
        	
        	// 1년을 이루는 일수 N, 일주일을 이루는 일수 M, 1년의 첫번째 날 L 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int M = Integer.valueOf(st.nextToken());
        	int L = Integer.valueOf(st.nextToken());
        	
        	// 월요일의 개수 계산
        	if(L!=1)
        		N-=M-L+1;
        	
        	int monday=N/M;
        	
        	if(N%M!=0)
        		monday++;
        	
        	// 월요일의 개수 출력
        	bw.write(monday+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class