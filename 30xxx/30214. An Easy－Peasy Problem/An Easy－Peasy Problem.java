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
        
        // 전반전과 대회가 종료할때 문제를 해결한 사람의 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.valueOf(st.nextToken());
        int s2 = Integer.valueOf(st.nextToken());
        
        // 문제가 쉬운지 확인
        bw.write(s1>=s2/2.?"E":"H");
        
        bw.close();
    } // end of main
} // end of Main class