import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 강을 뛰어넘는 횟수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 사용한 에너지 계산
        long lastPos = Long.valueOf(br.readLine());
        long energy=0;
        
        while(N--!=1) {
        	long curPos = Long.valueOf(br.readLine());
        	
        	energy += (curPos-lastPos)*(curPos-lastPos);
        	lastPos = curPos;
        }
        
        // 사용한 에너지 출력
        bw.write(energy+"");
        bw.close();
    } // end of main
} // end of Main class