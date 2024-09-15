import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 대문자와 소문자 목록
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        
        // 문자열 S 입력
        String S = br.readLine();
        
        // S를 ROT13으로 암호화한 내용 출력
        for(int i=0;i<S.length();i++)
        	
        	// 소문자
        	if('a'<=S.charAt(i)&&S.charAt(i)<='z')
        		bw.write(lowerCase.charAt((S.charAt(i)-84)%26));
        
        	// 대문자
        	else if('A'<=S.charAt(i)&&S.charAt(i)<='Z')
        		bw.write(upperCase.charAt((S.charAt(i)-52)%26));
        
        	// 그 외의 문자
        	else
        		bw.write(S.charAt(i));
        
        bw.close();
    } // end of main
} // end of Main class