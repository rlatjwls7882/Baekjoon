import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 쿠나 수 K, 프로젝트 수 N 입력
        int K = Integer.valueOf(br.readLine());
        int N = Integer.valueOf(br.readLine());
        
        // 1번~N-1번 프로젝트가 받을 돈 출력
        for(int i=1;i<=N-1;i++) {
        	bw.write(i+"\n");
        	K-=i;
        }
        
        // N번 프로젝트가 받을 돈 출력
        bw.write(K+"");
        bw.close();
    } // end of main
} // end of Main class