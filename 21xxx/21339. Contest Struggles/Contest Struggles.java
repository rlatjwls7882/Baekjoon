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
        
        // 총 문제수와 여태까지 푼 문제수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 문제의 평균 난이도와 이미 푼 문제의 평균 난이도 입력
        st = new StringTokenizer(br.readLine());
        int d = Integer.valueOf(st.nextToken());
        int s = Integer.valueOf(st.nextToken());
        
        // 풀리지 않은 문제의 평균 난이도 출력
        double average = (d*n-s*k)/(double)(n-k);
        
        if(average<0||average>100)
        	bw.write("impossible");
        else
        	bw.write(average+"");
        
        bw.close();
    } // end of main
} // end of Main class