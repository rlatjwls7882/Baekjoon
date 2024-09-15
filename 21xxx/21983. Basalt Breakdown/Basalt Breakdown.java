import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정육각형의 면적 입력
        double a = Double.valueOf(br.readLine());
        
        // 정육각형의 둘레 출력
        
        // a = √3/4 N^2 *6
        // 한 변의 길이 N = √(4a/6√3)
        bw.write(Math.sqrt(4*a/6/Math.sqrt(3))*6+"");
        
        bw.close();
    } // end of main
} // end of Main class