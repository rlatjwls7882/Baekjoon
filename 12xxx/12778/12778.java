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
        
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int M = Integer.valueOf(st.nextToken());
        	
        	// 알파벳-숫자 변환
        	if(st.nextToken().equals("C")) {
        		st = new StringTokenizer(br.readLine());
        		
        		while(M-->0)
        			bw.write(st.nextToken().charAt(0)-64+" ");
        	} else {
        		st = new StringTokenizer(br.readLine());
        		
        		while(M-->0)
        			bw.write((char)(Integer.valueOf(st.nextToken())+64)+" ");
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class