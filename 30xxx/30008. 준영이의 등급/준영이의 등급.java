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
        
        // 등급표
        int[] grade = {4, 11, 23, 40, 60, 77, 89, 96, 100};
        
        // 학생의 수 N, 과목의 수 K 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 등급 계산
        st = new StringTokenizer(br.readLine());
        
        while(K-->0) {
        	
        	int P = Integer.valueOf(st.nextToken())*100/N;
        	
        	for(int i=0;i<9;i++)
        		if(P<=grade[i]) {
        			bw.write(i+1+" ");
        			break;
        		}
        }
        
        bw.close();
    } // end of main
} // end of Main class