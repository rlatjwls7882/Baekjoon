import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(bf.readLine());
    	
    	// 첫번째 숫자 firstNum, 사이클 길이 cycleLenth
    	int firstNum = N, cycleLenth=0;
    	
    	while(true) {
    		
    		// 다음 수 계산
    		int tmp=N%10*10;
    		
    		int Nsum=0;
    		while(N!=0) {
    			Nsum += N%10;
    			N /= 10;
    		}
    		
    		N = tmp + Nsum%10;
    		cycleLenth++;
    		
    		// 첫번째 숫자와 같아질때 종료
    		if(firstNum==N)
    			break;
    	}
    	
    	// 사이클 길이 출력
    	bw.write(cycleLenth+"");
    	bw.close();
    } // end of main
} // end of Main class