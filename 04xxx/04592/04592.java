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
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	if(N==0) break;
        	
        	// 연속되는 중복 제거
        	int last = 0;
        	while(N-->0) {
        		int tmp = Integer.valueOf(st.nextToken());
        		if(last!=tmp) {
        			bw.write(tmp+" ");
        			last=tmp;
        		}
        	}
        	bw.write("$\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class