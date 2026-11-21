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
        	
        	// 거리 M, 기차의 속도 A, 비행기의 속도 B 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double M = Double.valueOf(st.nextToken());
        	double A = Double.valueOf(st.nextToken());
        	double B = Double.valueOf(st.nextToken());
        	
        	// 0 0 0 입력시 종료
        	if(M==0&&A==0&&B==0)
        		break;
        	
        	// 시간의 차이 계산
        	int h=0, m=0, t=0;
        	
        	t = (int)Math.round((M/A-M/B)*3600);
        	
        	if(t>59) {
        		m = t/60;
        		t%=60;
        	}
        	
        	if(m>59) {
        		h = m/60;
        		m%=60;
        	}
        	
        	// 시간의 차이 출력
        	bw.write(String.format("%d:%02d:%02d", h,m,t)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class