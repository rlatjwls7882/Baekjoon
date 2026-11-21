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
        
        // 학생의 N명의 기록 입력
        int N = Integer.valueOf(br.readLine());
        
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N;i++)
        	A[i] = Integer.valueOf(st.nextToken());
        
        // 학생의 순위 출력
        for(int i=0;i<N;i++) {
        	int rank=1;
        	
        	for(int j=0;j<N;j++)
        		if(A[i]>A[j])
        			rank++;
        	
        	bw.write(rank+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class