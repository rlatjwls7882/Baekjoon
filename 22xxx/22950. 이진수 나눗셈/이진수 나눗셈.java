import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N자리의 이진수 M, 나누는 수 K 입력
    	int N = Integer.valueOf(br.readLine());
    	String M = br.readLine();
    	int K = N - Integer.valueOf(br.readLine());
    	
    	
    	// 이진수 M이 2^K로 나누어 떨어지는지 확인
    	boolean isMod=true;
    	if(K<0) K=0;
    	
    	while(K<N)
    		if(M.charAt(K++)=='1') {
    			isMod=false;
    			break;
    		}
    	
    	bw.write(isMod?"YES":"NO");
    	
    	bw.close();
    } // end of main
} // end of Main class