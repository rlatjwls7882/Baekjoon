import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 참가자가 가장 마지막으로 참가한 라운드의 등수 입력
        	int round = Integer.valueOf(br.readLine());
        	
        	// 참가자가 마지막으로 참가한 라운드 출력
        	if(round<=25)
        		bw.write("Case #"+i+": World Finals\n");
        	
        	else if(round<=1000)
        		bw.write("Case #"+i+": Round 3\n");
        	
        	else if(round<=4500)
        		bw.write("Case #"+i+": Round 2\n");
        	
        	else
        		bw.write("Case #"+i+": Round 1\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class