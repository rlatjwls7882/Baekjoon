import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 두 주사위의 합이 sum이 되는 모든 케이스 출력
        	int sum = Integer.valueOf(br.readLine());
        	
        	bw.write("Case "+i+":\n");
        	
        	for(int j=1;j<=6;j++)
        		if(sum-j<=6&&j<=sum-j)
        			bw.write("("+j+","+(sum-j)+")\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class