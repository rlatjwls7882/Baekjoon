import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 거스름돈
    	int giveMoney = 1000 - Integer.valueOf(bf.readLine());
    	
    	// 잔돈의 개수 계산
    	int coinCnt=0;
    	
    	while(giveMoney>=500) {
    		coinCnt++;
    		giveMoney-=500;
    	}
    	
    	while(giveMoney>=100) {
    		coinCnt++;
    		giveMoney-=100;
    	}
    	
    	while(giveMoney>=50) {
    		coinCnt++;
    		giveMoney-=50;
    	}
    	
    	while(giveMoney>=10) {
    		coinCnt++;
    		giveMoney-=10;
    	}
    	
    	while(giveMoney>=5) {
    		coinCnt++;
    		giveMoney-=5;
    	}
    	
    	while(giveMoney>=1) {
    		coinCnt++;
    		giveMoney-=1;
    	}
    	
    	// 잔돈의 개수 출력
    	bw.write(coinCnt+"");
    	bw.close();
    } // end of main
} // end of Main class