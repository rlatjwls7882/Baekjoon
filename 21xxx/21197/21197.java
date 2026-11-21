import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 버튼을 누른 횟수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 스톱워치 타이머에 표시된 초 계산
        int time=0;
        
        while(N!=0) {
        	
        	if(N>=2) {
        		int start = Integer.valueOf(br.readLine());
        		int end = Integer.valueOf(br.readLine());
        		
        		time += end-start;
        		N-=2;
        	}
        	
        	else {
        		time=-1;
        		break;
        	}
        }
        
        // 스톱워치 타이머에 표시된 초 출력
        if(time==-1)
        	bw.write("still running");
        else
        	bw.write(time+"");
        
        bw.close();
    } // end of main
} // end of Main class