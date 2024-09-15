import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 가격이 P인 물건을 사고 1 달러를 냄
        int P = 100-Integer.valueOf(br.readLine());
        
        // 잔돈 반환
        
        // 25센트
        bw.write(P/25+" ");
        P%=25;
        
        // 10센트
        bw.write(P/10+" ");
        P%=10;
        
        // 5센트
        bw.write(P/5+" ");
        P%=5;
        
        // 1센트
        bw.write(P+"");
        
        bw.close();
    } // end of main
} // end of Main class