import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 배열의 크기 N 입력
        int N = Integer.valueOf(br.readLine());
        bw.write(N+"\n");
        
        // A₁~AN-1 출력
        for(int i=1;i<N;i++)
        	bw.write(i+" ");
        
        // AN-1보다 큰 소수 출력
        for(int i=N;;i++) {
        	
        	int cnt=0;
        	for(int j=2;j<i;j++)
        		if(i%j==0)
        			cnt++;
        	
        	if(cnt==0) {
        		bw.write(i+"");
        		break;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class