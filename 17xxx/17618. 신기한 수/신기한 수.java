import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.valueOf(bf.readLine());
    	int specialNum=0;
    	
    	for(int i=1;i<=N;i++) {
    		
    		//자릿수의 합 cnt 계산
    		int tmp=i;
    		int cnt=0;
    		
    		while(tmp!=0) {
    			cnt+=tmp%10;
    			tmp/=10;
    		}
    		
    		// 신기한 수의 개수 확인
    		if(i%cnt==0)
    			specialNum++;
    	}
    	
    	bw.write(specialNum+"");
    	bw.close();
    } // end of main
} // end of Main class