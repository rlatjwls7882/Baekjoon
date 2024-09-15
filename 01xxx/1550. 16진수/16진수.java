import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 16진수 -> 10진수
    	int hexNum = Integer.valueOf(br.readLine(),16);
    	
    	// 10진수 출력
    	bw.write(hexNum+"");
    	bw.close();
    } // end of main
} // end of Main class