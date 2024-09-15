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
        
        // 심사위원이 작성한 해답의 수, 곱하는 값 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int s = Integer.valueOf(st.nextToken());
        
        // 가장 느린 심사위원의 해답 계산
        st = new StringTokenizer(br.readLine());
        int slowest=1;
        
        while(n--!=0) {
        	int m = Integer.valueOf(st.nextToken());
        	
        	if(slowest<m)
        		slowest=m;
        }
        
        // 가장 느린 심사위원의 해답보다 최소 s배 이상이 소요되는 가장 적은 초단위 시간 출력
        bw.write((int)Math.ceil(slowest*s/1000.0)+"");
        bw.close();
    } // end of main
} // end of Main class