import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 완벽한 도미노 세트의 크기 입력
        int N = Integer.valueOf(br.readLine());
        
        // 완벽한 도미노 세트에 있는 점의 총 개수 계산
        
//        for(int i=0;i<=N;i++)
//        	for(int j=0;j<=N;j++)
//        		point += i+j;
        
        int point = N*(N+1)*(N+2)/2;
        
        // 점의 개수 출력
        bw.write(point+"");
        bw.close();
    } // end of main
} // end of Main class