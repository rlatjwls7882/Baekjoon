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
        
        // 공부하고자 한 일수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 계획을 성실히 지킨 횟수 계산
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cnt=0;
        
        while(N--!=0) {
        	
        	int plan = Integer.valueOf(st1.nextToken());
        	int study = Integer.valueOf(st2.nextToken());
        	
        	if(plan<=study)
        		cnt++;
        }
        
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class