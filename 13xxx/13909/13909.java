import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        // 창문이 열리는 개수 계산(약수의 개수가 홀수인 수==제곱수) 
        /*
         * 1 (1) 열
         * 2 (1, 2) 닫
         * 3 (1, 3) 닫
         * 4 (1, 2, 4) 열
         * 5 (1, 5) 닫
         * 6 (1, 2, 3, 6) 닫
         * 7 (1, 7) 닫
         * 8 (1, 2, 4, 8) 닫
         * 9 (1, 3, 9) 열
         */
        bw.write((int)Math.floor(Math.sqrt(N))+"");
        
        bw.close();
    } // end of main
} // end of Main class
