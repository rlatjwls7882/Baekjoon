import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입출금 횟수 입력
        int n = Integer.valueOf(br.readLine());
        
        // 돈이 -가 되지 않기 위해 초기에 필요한 돈 계산
        int currmoney=0, firstmoney=0;
        
        while(n-->0) {
        	
        	currmoney += Integer.valueOf(br.readLine());
        	
        	if(currmoney<0) {
        		firstmoney += -currmoney;
        		currmoney=0;
        	}
        }
        
        // 돈이 -가 되지 않기 위해 초기에 필요한 돈 출력
        bw.write(firstmoney+"");
        bw.close();
    } // end of main
} // end of Main class