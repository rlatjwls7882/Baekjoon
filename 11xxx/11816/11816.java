import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 X 입력
        String X = br.readLine();
        
        // X가 16진수 인경우
        if(X.charAt(1)=='x')
        	bw.write(Integer.valueOf(X.substring(2), 16)+"");
        
        // X가 8진수 인경우
        else if(X.charAt(0)=='0')
        	bw.write(Integer.valueOf(X.substring(1), 8)+"");
        
        // X가 10진수 인경우
        else
        	bw.write(X);
        	
        bw.close();
    } // end of main
} // end of Main class