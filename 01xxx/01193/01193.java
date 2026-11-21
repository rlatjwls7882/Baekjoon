import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	int X = Integer.valueOf(br.readLine());
    	
    	// X번째 분수가 몇번째 지그재그인지 확인
    	int n = (int)Math.ceil(Math.sqrt(2*X+1/4.)-1/2.);
    	X-=(n-1)*n/2;
    	
    	// 홀수번째 지그재그일때 n/1로 시작, 짝수번째 지그재그일때 1/n으로 시작
    	if(n%2==1)
    		bw.write((n-X+1)+"/"+X);
    	else
    		bw.write(X+"/"+(n-X+1));
    	
    	bw.close();
    } // end of main
} // end of Main class