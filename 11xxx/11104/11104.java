import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        
        // 이진수를 입력받아 10진수로 출력
        while(T-->0)
        	bw.write(Integer.valueOf(br.readLine(),2)+"\n");
        
        bw.close();
    } // end of main
} // end of Main class