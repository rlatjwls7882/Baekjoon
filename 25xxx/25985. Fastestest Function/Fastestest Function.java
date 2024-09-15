import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 최적화 전과 후의 foo 함수가 차지하는 비율 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        
        // 최적화로 foo 함수가 얼마나 빨라졌는지 출력
        bw.write((100-y)*x/((100.-x)*y)+"");
        
        bw.close();
    } // end of main
} // end of Main class