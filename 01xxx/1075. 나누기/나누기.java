import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 정수 N, F 입력
        int N = Integer.valueOf(br.readLine());
        int F = Integer.valueOf(br.readLine());
        
        // 나누어 떨어지는 수의 가장작은 마지막 두 자리 출력
        N -= N%100;
        
        for(int i=0;i<100;i++)
        	if((N+i)%F==0) {
        		bw.write(String.format("%02d", i)+"");
        		break;
        	}
        
        bw.close();
    } // end of main
} // end of Main class