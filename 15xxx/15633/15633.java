import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 입력값
    	int n = Integer.valueOf(bf.readLine());
    	
    	// 소수의 합 계산
    	int output=0;
    	for(int i=1;i<=n;i++)
    		if(n%i==0)
    			output+=i;
    	
    	// *5 -24
    	output*=5;
    	output-=24;
    	
    	// 출력
    	bw.write(output+"");
    	bw.close();
    } // end of main
} // end of Main class