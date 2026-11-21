import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 양의 정수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 세 자리마다 콤마를 찍어 출력
        bw.write(String.format("%,d", N)+"");
        bw.close();
    } // end of main
} // end of Main class