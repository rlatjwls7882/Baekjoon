import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 별 출력
    	for(int i=1;i<=N;i++){
    		for(int j=N-i;j>0;j--)
    			bw.write(" ");
    		
    		for(int j=1;j<=i;j++)
    			bw.write("*");
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class