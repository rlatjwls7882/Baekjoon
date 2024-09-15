import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 짧은 배수로의 끝에서 만들어진 각의 크기(원주각) 출력
        bw.write("90");
        bw.close();
    } // end of main
} // end of Main class