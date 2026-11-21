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
        	
        	// 최단거리 D, 레일 설치 예산 E 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int D = Integer.valueOf(st.nextToken());
        	int E = Integer.valueOf(st.nextToken());
        	
        	// 0 0 입력시 종료
        	if(D==0&&E==0) break;
        	
        	// 레일 깔 때의 비용과 예산의 차의 최솟값 계산
        	double min = 100;
        	
        	for(double i=0;i<=D/2.;i++) {
        		
        		double tmp = Math.abs(Math.sqrt(i*i+(D-i)*(D-i))-E);
        		
        		if(min>tmp) min=tmp;
        	}
        	
        	// 레일 깔 때의 비용과 예산의 차의 최솟값 출력
        	bw.write(min+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class