import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 참가자의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 득표수의 첫번째 값과 최대값 계산
        int first = Integer.valueOf(br.readLine());
        
        int max = first;
        
        for(int i=0;i<N-1;i++) {
        	int tmp = Integer.valueOf(br.readLine());
        	
        	if(tmp>max) max=tmp;
        }
        
        // 카를로스가 광대로 선출 되었는지 출력
        if(max==first)
        	bw.write("S");
        else
        	bw.write("N");
        
        bw.close();
    } // end of main
} // end of Main class