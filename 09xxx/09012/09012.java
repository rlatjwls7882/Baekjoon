import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		String PS = br.readLine();
    		
    		int isVPS=0;
    		for(int i=0;i<PS.length();i++) {
    			
    			// 여는 괄호일때 +1, 닫는 괄호일때 -1
    			if(PS.charAt(i)=='(')
    				isVPS++;
    			else
    				isVPS--;
    			
    			// 한번이라도 닫는 괄호가 많을 때
    			if(isVPS<0) break;
    		}
    		
    		// VPS인 문자열인지 출력
    		if(isVPS==0)
    			bw.write("YES\n");
    		else
    			bw.write("NO\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class