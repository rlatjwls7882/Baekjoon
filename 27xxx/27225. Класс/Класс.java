import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 남학생의 수 n과 여학생의 수 m 입력
        int n = Integer.valueOf(br.readLine());
        int m = Integer.valueOf(br.readLine());
        
        // 수업에 집중할 수 있는 학생의 최댓값 출력
        bw.write(Math.min(n, m)*2+Math.abs(n-m)%2+"");
        
        bw.close();
    } // end of main
} // end of Main class