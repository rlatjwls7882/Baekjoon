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
        
        // 날의 수 n, 전날보다 높아야하는 밀리초 k 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 받는 선물의 수 계산
        int gift=0, yesterday = Integer.valueOf(br.readLine());
        
        for(int i=1;i<n;i++) {
        	
        	int today = Integer.valueOf(br.readLine());
        	
        	// 전날보다 k 이상 빠른 경우
        	if(today<=yesterday-k)
        		gift++;
        	
        	yesterday = today;
        }
        
        // 받는 선물의 수 출력
        bw.write(gift+"");
        bw.close();
    } // end of main
} // end of Main class