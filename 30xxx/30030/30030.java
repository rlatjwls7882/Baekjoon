import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 부가가치세를 포함시킨 금액 B 입력
        int B = Integer.valueOf(br.readLine());
        
        // 부가가치세를 제외한 금액 출력
        bw.write(B*10/11+"");
        bw.close();
    } // end of main
} // end of Main class