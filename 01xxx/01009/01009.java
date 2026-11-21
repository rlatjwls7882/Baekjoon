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
    	
    	// 테스트 케이스의 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// a^b 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken());
    		int b = Integer.valueOf(st.nextToken());
    		
    		// 마지막 데이터가 처리되는 컴퓨터의 번호(a^b의 마지막 자리수) 계산
    		int comNum=a%10;
    		
    		while(b--!=1)
    			comNum=comNum*a%10;
    		
    		if(comNum==0)
    			comNum=10;
    		
    		// 컴퓨터의 번호 출력
    		bw.write(comNum+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class