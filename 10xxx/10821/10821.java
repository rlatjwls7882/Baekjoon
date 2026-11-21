import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S 입력
        StringTokenizer S = new StringTokenizer(br.readLine(),",");
        
        // 문자열 S의 정수의 개수 출력
        bw.write(S.countTokens()+"");
        bw.close();
    } // end of main
} // end of Main class