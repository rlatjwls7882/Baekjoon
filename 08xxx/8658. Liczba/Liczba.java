import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n의 약수가 아닌 수 중 가장 작은 수 출력
        for(int i=2;i<n;i++)
        	if(n%i!=0) {
        		bw.write(i+" ");
        		break;
        	}
        
        // n의 약수가 아닌 수 중 가장 큰 수 출력
        for(int i=n-1;i>1;i--)
        	if(n%i!=0) {
        		bw.write(i+"");
        		break;
        	}
        
        bw.close();
    } // end of main
} // end of Main class