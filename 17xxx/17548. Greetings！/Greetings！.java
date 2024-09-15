import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 s 입력
        String s = br.readLine();
        
        // e가 2배가 되도록 출력
        bw.write(s.replace("e", "ee")+"");
        bw.close();
    } // end of main
} // end of Main class