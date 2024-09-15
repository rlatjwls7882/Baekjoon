import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// T 입력
    	double T = Double.valueOf(br.readLine());
    	
    	// a^2 = b^2 + (T/2)^2
    	
    	// a^2 - b^2 출력
    	bw.write((int)Math.round(T*T/4)+"");
    	bw.close();
    } // end of main
} // end of Main class