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
        
        // 백준 문제 해결 수, 유니온 레벨, 최고레벨 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int U = Integer.valueOf(st.nextToken());
        int L = Integer.valueOf(st.nextToken());
        
        // 모두 만족하는 경우
        if(N>=1000&&(U>=8000||L>=260))
        	bw.write("Very Good");
        
        // 백준의 대회 출제 조건만 만족하는 경우
        else if(N>=1000)
        	bw.write("Good");
        
        // 만족하지 못하는 경우
        else
        	bw.write("Bad");
        
        bw.close();
    } // end of main
} // end of Main class