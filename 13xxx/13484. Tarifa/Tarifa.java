import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 데이터 한도 X, 달의 수 N 입력
        int X = Integer.valueOf(br.readLine());
        int N = Integer.valueOf(br.readLine());
        
        // N+1번째 달에 사용할 수 있는 MB 계산
        int MB = X;
        
        while(N--!=0)
        	MB += X-Integer.valueOf(br.readLine());
        
        // N+1번째 달에 사용할 수 있는 MB 출력
        bw.write(MB+"");
        bw.close();
    } // end of main
} // end of Main class