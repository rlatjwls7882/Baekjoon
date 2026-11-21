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
    		
    		// 참가자수 N, 개최비용 M, 인당 내야하는 금액 pay
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int M = Integer.valueOf(st.nextToken());
    		
    		// 0 0 입력시 종료
    		if(N==0&&M==0) break;
    		
    		int pay = M/N;
    		
    		// 오늘 걷은 금액 계산
    		int totalPay=0;
    		st = new StringTokenizer(br.readLine());
    		
    		while(N--!=0) {
    			int Ai = Integer.valueOf(st.nextToken());
    			
    			if(Ai>pay) totalPay+=pay;
    			else totalPay+=Ai;
    		}
    		
    		// 총 걷은 금액 출력
    		bw.write(totalPay+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class