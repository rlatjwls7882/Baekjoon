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
        	
        	// 학생의 성과 이름 입력
        	String firstName = br.readLine();
        	String lastName = br.readLine();
        	
        	// 학생의 이름, 성 입력
        	bw.write(String.format("Case %d: %s, %s\n",i , lastName, firstName)+"");
        }
        
        bw.close();
    } // end of main
} // end of Main class