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
        
        // 자전거 보관소의 크기 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 운행 시작할때와 끝날때 보관소에 있는 자전거의 수 입력
        StringTokenizer a = new StringTokenizer(br.readLine());
        StringTokenizer b = new StringTokenizer(br.readLine());
        
        // 자전거를 a 상태로 만들기 위해 옮겨야 하는 최소 횟수 계산
        int move=0;
        
        while(N--!=0) {
        	
        	int diff = Integer.valueOf(a.nextToken()) - Integer.valueOf(b.nextToken());
        	
        	if(diff>0)
        		move += diff;
        }
        
        // 자전거를 a 상태로 만들기 위해 옮겨야 하는 최소 횟수 출력
        bw.write(move+"");
        bw.close();
    } // end of main
} // end of Main class