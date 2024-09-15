import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 K 입력
    	int K = Integer.valueOf(br.readLine());
    	
    	for(int i=1;i<=K;i++) {
    		
    		// 머리수 head, 행동 action 입력
    		int head = Integer.valueOf(br.readLine());
    		String action = br.readLine();
    		
    		// 머리수 계산
    		for(int j=0;j<action.length();j++) {
    			if(action.charAt(j)=='c') head++;
    			else head--;
    		}
    		
    		// 머리수 출력
    		bw.write("Data Set "+i+":\n"+head);
    		
    		// 개행
    		if(i!=K) bw.write("\n\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class