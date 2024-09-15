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
        
        // N이 홀수인 경우 홀수 짝수 모두 만들 수 있음
        if(N%2==1)
        	bw.write("Either");
        
        // N이 4의 배수인 경우 짝수만 만들 수 있음
        else if(N%4==0)
        	bw.write("Even");
        
        // N이 4의 배수가 아닌 2의 배수인 경우 홀수만 만들 수 있음
        else
        	bw.write("Odd");
        
        bw.close();
    } // end of main
} // end of Main class