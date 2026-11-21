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
        int R = Integer.valueOf(st.nextToken());
        int C = Integer.valueOf(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // 체스판 출력
        for(int i=0;i<R*A;i++) {
        	for(int j=0;j<C*B;j++) {
        		if(i/A%2==0) {
        			if(j/B%2==0) bw.write("X");
        			else bw.write(".");
        		} else {
        			if(j/B%2==0) bw.write(".");
        			else bw.write("X");
        		}
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class