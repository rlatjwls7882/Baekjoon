import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 입력
        String string = br.readLine();
        
        // 암호화된 메세지 출력
        for(int i=0;i<string.length();i++) {
        	
        	// 소문자
        	if('a'<=string.charAt(i)&&string.charAt(i)<='z')
        		bw.write(String.format("%02d", string.charAt(i)-'a'+1));
        	
        	// 대문자
        	else if('A'<=string.charAt(i)&&string.charAt(i)<='Z')
        		bw.write(String.format("%02d", string.charAt(i)-'A'+27));
        	
        	// 숫자
        	else if('0'<=string.charAt(i)&&string.charAt(i)<='9')
        		bw.write("#"+string.charAt(i));
        	
        	// 그 외의 문자
        	else
        		bw.write(string.charAt(i)+"");
        }
        
        bw.close();
    } // end of main
} // end of Main class