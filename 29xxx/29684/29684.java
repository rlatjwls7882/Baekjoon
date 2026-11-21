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
        	
        	// 참가한 팀의 수 n 입력
        	int n = Integer.valueOf(br.readLine());
        	
        	if(n==0) break;
        	
        	// 2023초에 가장 가깝게 제출한 팀 확인
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int team=0, nearestsec=100000;
        	
        	for(int i=1;i<=n;i++) {
        		
        		int sec = Integer.valueOf(st.nextToken());
        		
        		if(Math.abs(2023-sec)<Math.abs(2023-nearestsec)) {
        			nearestsec=sec;
        			team=i;
        		}
        	}
        	
        	// 2023초에 가장 가깝게 제출한 팀 출력
        	bw.write(team+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class