import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	// 탈출할 수 있는 사람의 수(약수가 홀수인 수==제곱수) 계산
    	while(T-->0)
    		bw.write((int)Math.sqrt(Double.valueOf(br.readLine()))+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class