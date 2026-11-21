import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	int N = Integer.valueOf(br.readLine());
        	int squardN = N*N;
        	
        	// 자기복제수인지 확인
        	if(N==squardN%Math.pow(10, (int)Math.log10(N)+1))
        		bw.write("YES\n");
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class