import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열 길이 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 수미상관, 팰린드롬 만족하는 문자열 출력
    	while(N--!=0)
    		bw.write("a");
    	
    	bw.close();
    } // end of main
} // end of Main class