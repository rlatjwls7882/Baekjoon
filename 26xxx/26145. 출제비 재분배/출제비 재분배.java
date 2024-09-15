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

        // 출제자수, 검수자수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 출제자가 받은 출제비 입력
        int[] S = new int[N+M];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N;i++)
        	S[i] = Integer.valueOf(st.nextToken());
        
        // 운영자가 받는 출제비 계산
        for(int i=0;i<N;i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	for(int j=0;j<N+M;j++) {
        		
        		// i번째 운영자가 j번째 운영자에게 출제비 제공
        		int T = Integer.valueOf(st.nextToken());
        		S[i] -= T;
        		S[j] += T;
        	}
        }
        
        // 운영자가 받는 출제비 출력
        for(int i:S)
        	bw.write(i+" ");
        bw.close();
    } // end of main
} // end of Main class