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
        
        // 올바른 로그인을 할 수 있는지 확인
        try {
			
        	// "io"로 시작하고 그 뒤는 숫자들로 이루어짐
        	if(string.substring(0,2).equals("io")&&Integer.valueOf(string.substring(2))!=-1)
        		bw.write("Correct");
        	else
        		throw new Exception();
        	
		} catch (Exception e) {
			bw.write("Incorrect");
		}
        
        bw.close();
    } // end of main
} // end of Main class