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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(st.hasMoreTokens()) {
        	
        	// 정수 N 입력
        	int N = Integer.valueOf(st.nextToken());
        	
        	// N 크기의 V 출력
        	for(int i=0;i<N;i++) {
        		
        		for(int j=0;j<i;j++)
        			bw.write(" ");
        		
        		bw.write("*");
        		
        		for(int j=i*2;j<(N-1)*2-1;j++)
        			bw.write(" ");
        		
        		if(i!=N-1)
        			bw.write("*");
        		
        		bw.write("\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class