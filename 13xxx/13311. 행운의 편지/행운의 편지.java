import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 모든 수의 배수(0)의 -1 출력
        bw.write("-1");
        bw.close();
    } // end of main
} // end of Main class