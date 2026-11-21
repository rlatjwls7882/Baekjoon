import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1부터 10까지 정수 중에서 하나를 출력
        bw.write((int)(Math.random()*10)+1+"");
        
        bw.close();
    } // end of main
} // end of Main class