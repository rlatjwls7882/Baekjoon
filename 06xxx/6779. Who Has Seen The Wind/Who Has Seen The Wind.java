import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 습도와 마가렛이 기다리는 최대 시간 입력
        int h = Integer.valueOf(br.readLine());
        int M = Integer.valueOf(br.readLine());
        
        // 기상 관측기가 0 이하의 고도를 가지는 최소 시간 계산
        int T=0;
        
        for(int t=1;t<=M;t++)
        	if(-6*t*t*t*t+h*t*t*t+2*t*t+t<=0) {
        		T = t;
        		break;
        	}
        
        // 기상 관측기가 0 이하의 고도를 가지는 최소 시간 출력
        if(T==0)
        	bw.write("The balloon does not touch ground in the given time.");
        else
        	bw.write("The balloon first touches ground at hour: "+T);
        
        bw.close();
    } // end of main
} // end of Main class