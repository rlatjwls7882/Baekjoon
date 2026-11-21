import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 입력
    	int N = Integer.valueOf(br.readLine());
    	String string = br.readLine();
    	
    	// 출력
    	for(int i=N-5;i<N;i++)
    		bw.write(string.charAt(i));
    	
    	bw.close();
    } // end of main
} // end of Main class