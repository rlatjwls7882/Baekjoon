import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 길이 N의 문자열 입력
        int N = Integer.valueOf(br.readLine());
        String string = br.readLine();
        
        // 상자 3에 공이 들어간 횟수 계산
        int box=1, numOf3=0;
        
        for(int i=0;i<N;i++) {
        	
        	// 공 움직이기
        	if(string.charAt(i)=='L') box--;
        	else box++;
        	
        	// 마지막 상자
        	if(box==0) box=1;
        	else if(box==4) box=3;
        	
        	// 3번 상자
        	if(box==3) numOf3++;
        }
        
        // 상자 3에 공이 들어간 횟수 출력
        bw.write(numOf3+"");
        bw.close();
    } // end of main
} // end of Main class