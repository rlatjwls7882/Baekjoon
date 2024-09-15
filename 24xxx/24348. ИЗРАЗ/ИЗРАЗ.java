import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 음이 아닌 세 정수 a, b, c 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] abc = new long[3];
        
        for(int i=0;i<3;i++)
        	abc[i] = Long.valueOf(st.nextToken());
        
        // 세 정수를 '+', '-', '*'를 최대 하나 사용하여 만들어진 수식의 최댓값 계산
        Arrays.sort(abc);
        
        long case1 = abc[0]+abc[1]*abc[2];
        long case2 = abc[0]-abc[1]+abc[2];
        
        // 최댓값 출력
        long max = case1>case2?case1:case2;
        bw.write(max+"");
        
        bw.close();
    } // end of main
} // end of Main class