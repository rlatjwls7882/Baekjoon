import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 연속하는 n개의 정수 선택
    	int n = Integer.valueOf(br.readLine());
    	
    	// 홀수 n -> 홀수, 짝수
    	if(n%2==1)
    		bw.write("0");
    	
    	// 홀수가 짝수개인 짝수(4의 배수) n -> 짝수
    	else if(n%4==0)
    		bw.write("2");
    	
    	// 홀수가 홀수개인 짝수(4의 배수가 아닌 2의 배수) n -> 홀수
    	else
    		bw.write("1");
    	
    	bw.close();
    } // end of main
} // end of Main class