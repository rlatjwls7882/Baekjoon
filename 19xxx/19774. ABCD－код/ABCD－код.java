import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 암호 후보의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 암호 후보 입력
        	int A = Integer.valueOf(br.readLine());
        	int B = A%100; A/=100;
        	
        	// 정원 입구의 암호가 될 수 있는지 출력
        	if((A*A+B*B)%7==1)
        		bw.write("YES\n");
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class