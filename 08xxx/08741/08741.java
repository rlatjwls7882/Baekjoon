import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// k 입력
    	int k = Integer.valueOf(br.readLine());
    	
    	// k자리 이하의 이진수의 합 출력
    	for(int i=0;i<k;i++)
    		bw.write("1");
    	for(int i=1;i<k;i++)
    		bw.write("0");
    	
    	bw.close();
    } // end of main
} // end of Main class