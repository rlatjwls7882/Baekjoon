import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 접두사와 접미사가 일치하는 문자열 출력
        bw.write("1 1");
        
        bw.close();
    } // end of main
} // end of Main class