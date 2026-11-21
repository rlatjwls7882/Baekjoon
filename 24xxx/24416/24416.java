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
    	
    	// 코드1은 피보나치수만큼 반복한다
    	int[] fib = new int[N+1];
    	fib[1] = 1; fib[2] = 1;
    	
    	// N의 피보나치 수 계산
    	for(int i=3;i<=N;i++)
    		fib[i] = fib[i-1] + fib[i-2];
    	
    	// 코드2는 N-2번 반복한다
    	
    	// 코드 1,2의 반복횟수 출력
    	bw.write(fib[N]+" "+(N-2));
    	bw.close();
    } // end of main
} // end of Main class