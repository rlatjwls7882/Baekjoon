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
    	
    	// 정사각형 출력
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++)
    			bw.write("*");
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class