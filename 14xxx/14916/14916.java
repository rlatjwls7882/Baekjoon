import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 거스름돈 n 입력
    	int n = Integer.valueOf(br.readLine());
    	
    	// 거스름돈 동전의 최소 개수 계산
    	int coin=0;
    	
    	// 2원짜리 동전
    	while(n%5!=0) {
    		coin++;
    		n-=2;
    	}
    	
    	// 5원짜리 동전
    	coin+=n/5;
    	
    	// 거스름돈을 거슬러 줄 수 없는 경우
    	if(n<0) coin=-1;
    	
    	// 동전의 최소 개수 출력
    	bw.write(coin+"");
    	bw.close();
    } // end of main
} // end of Main class