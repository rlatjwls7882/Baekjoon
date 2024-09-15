import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 s
        String s = br.readLine();
        
        // 빌이 이길 수 있는지 확인
        bw.write(s.charAt(0)!=s.charAt(s.length()-1)?"Win":"Lose");
        
        bw.close();
    } // end of main
} // end of Main class