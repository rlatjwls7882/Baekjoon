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
        
        // 총 평가해야 하는 문제수, 미리 평가한 문제수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 미리 평가한 점수의 합 계산
        double sum=0;
        
        for(int i=0;i<k;i++)
        	sum += Integer.valueOf(br.readLine());
        
        // 받을 수 있는 최소 평점과 최대 평점 출력
        bw.write(((sum-3*(n-k))/n)+" "+((sum+3*(n-k))/n));
        bw.close();
    } // end of main
} // end of Main class