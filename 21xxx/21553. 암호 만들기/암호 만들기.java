import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 A와 암호 P 입력
        String A = br.readLine();
        String P = br.readLine();
        
        // P가 유일한 비밀번호가 되게 하는 문자열 B 출력
        bw.write(P);
        bw.close();
    } // end of main
} // end of Main class