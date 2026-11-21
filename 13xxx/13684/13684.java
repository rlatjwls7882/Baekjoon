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
        
        while(true) {
        	
        	// 응답할 쿼리의 수 입력
        	int K = Integer.valueOf(br.readLine());
        	
        	if(K==0) break;
        	
        	// 분할 지점의 좌표 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int M = Integer.valueOf(st.nextToken());
        	
        	while(K-->0) {
        		
        		// 거주지의 좌표
        		st = new StringTokenizer(br.readLine());
        		int X = Integer.valueOf(st.nextToken());
        		int Y = Integer.valueOf(st.nextToken());
        		
        		// 북서 노고니아
        		if(X<N&&Y>M)
        			bw.write("NO\n");
        		
        		// 북동 노고니아
        		else if(X>N&&Y>M)
        			bw.write("NE\n");
        		
        		// 남동 노고니아
        		else if(X>N&&Y<M)
        			bw.write("SE\n");
        		
        		// 남서 노고니아
        		else if(X<N&&Y<M)
        			bw.write("SO\n");
        		
        		// 분할 선
        		else
        			bw.write("divisa\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class