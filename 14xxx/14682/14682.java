import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N, K 입력
        int N = Integer.valueOf(br.readLine());
        int K = Integer.valueOf(br.readLine());
        
        // N<<0~K의 합 sum 계산
        int sum=N;
        
        while(K--!=0)
        	sum+=N*=10;
        
        // sum 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class
