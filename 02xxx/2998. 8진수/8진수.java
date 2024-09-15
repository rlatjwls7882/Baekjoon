import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 2진수 입력
    	BigInteger binary = new BigInteger(br.readLine(),2);
    	
    	// 8진수로 출력
    	bw.write(binary.toString(8));
    	
    	bw.close();
    } // end of main
} // end of Main class