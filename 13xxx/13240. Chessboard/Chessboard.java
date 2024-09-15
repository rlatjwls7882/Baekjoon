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
        
        // 열과 행의 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 체스판의 패턴 출력
        for(int i=1;i<=N;i++) {
        	for(int j=1;j<=M;j++) {
        		
        		if(i%2==1&&j%2==1)
        			bw.write("*");
        		else if(i%2==1)
        			bw.write(".");
        		else if(i%2==0&&j%2==1)
        			bw.write(".");
        		else
        			bw.write("*");
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class