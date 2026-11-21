import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열의 길이와 문자열 입력
        int N = Integer.valueOf(br.readLine());
        String string = br.readLine();
        
        // 문자열을 같은 두 개의 문자열로 나눌 수 있는지 판단
        if(string.substring(0, N/2).equals(string.substring(N/2)))
        	bw.write("Yes");
        else
        	bw.write("No");
        
        bw.close();
    } // end of main
} // end of Main class