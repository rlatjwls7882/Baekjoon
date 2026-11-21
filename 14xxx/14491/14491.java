import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 10진수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	// 9진수로 출력
    	bw.write(Integer.toString(T,9));
    	
    	bw.close();
    } // end of main
} // end of Main class