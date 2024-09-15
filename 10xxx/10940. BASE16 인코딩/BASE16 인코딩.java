import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S 입력
        String S = br.readLine();
        
        // S를 BASE16으로 인코딩한 값(16진수) 출력
        for(int i=0;i<S.length();i++)
        	bw.write(Integer.toHexString(S.charAt(i)).toUpperCase());
        
        bw.close();
    } // end of main
} // end of Main class