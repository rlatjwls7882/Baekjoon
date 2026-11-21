import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		
    		// n 입력
    		int n = Integer.valueOf(br.readLine());
    		
    		// -1 입력시 종료
    		if(n==-1) break;
    		
    		// 약수의 합 계산
    		StringBuilder sb = new StringBuilder();
    		int sum=1;
    		sb.append(1);
    		
    		for(int i=2;i<n;i++)
    			if(n%i==0) {
    				sum+=i;
    				sb.append(" + ").append(i);
    			}
    		
    		// 완전수인 경우
    		if(sum==n)
    			bw.write(n+" = "+sb+"\n");
    		
    		// 완전수가 아닌 경우
    		else
    			bw.write(n+" is NOT perfect.\n");
    	}

    	bw.close();
    } // end of main
} // end of Main class