import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 좌석의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 절반의 사람이 옆자리 사람과 앉게 되는 탑승자수 출력
        bw.write(N/6*4+"");
        
        bw.close();
    } // end of main
} // end of Main class