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
        
        while(true) {
        	
        	// n 입력
        	int n = Integer.valueOf(br.readLine());
        	
        	// -1 입력시 종료
        	if(n==-1) break;
        	
        	// 총 마일 수 계산
        	int totalMile=0, beforehour=0;
        	
        	while(n--!=0) {
        		
        		// 거리수 s, 현재시간 curhour 입력
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int s = Integer.valueOf(st.nextToken());
        		int curhour = Integer.valueOf(st.nextToken());
        		
        		// 마일 수 계산
        		totalMile += s*(curhour-beforehour);
        		beforehour = curhour;
        	}
        	
        	// 총 마일 수 출력
        	bw.write(totalMile+" miles\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class