import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		// 최대 1000자리 숫자 입력
    		String N = bf.readLine();
    		
    		// 입력값이 0일 경우 종료
    		if(N.equals("0")) break;
    		
    		//N의 디지털 루트 계산
    		int digitalRoot=0;
    		for(int i=0;i<N.length();i++)
    			digitalRoot += N.charAt(i)-'0';
    		
    		//디지털 루트가 한자리 수가 될 때까지
    		while(digitalRoot/10!=0) {
    			
    			//새로운 디지털 루트 계산
    			int tmp=0;
    			while(digitalRoot!=0) {
    				tmp+=digitalRoot%10;
    				digitalRoot/=10;
    			}
    			digitalRoot=tmp;
    		}
    		
    		//한자리의 디지털 수를 출력
    		bw.write(digitalRoot+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class