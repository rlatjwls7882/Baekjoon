import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 소인수분해 결과 출력
        for(int i=2;i*i<=N;i++) {
        	while(N%i==0) {
        		N/=i;
        		bw.write(i+"\n");
        	}
        }
        
        if(N!=1) bw.write(N+"");
        
        bw.close();
    } // end of main
} // end of Main class