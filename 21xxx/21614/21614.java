import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 방향
        String dir = "";
        
        while(true) {
        	
        	// 다섯자리의 비밀 지령 입력
        	String secret = br.readLine();
        	
        	// 99999 입력시 종료
        	if(secret.equals("99999"))
        		break;
        	
        	// 방향과 가야하는 걸음 수 출력
        	if(secret.charAt(0)=='0'&&secret.charAt(1)=='0');
        	else if((secret.charAt(0)+secret.charAt(1))%2==0)
        		dir = "right";
        	else
        		dir = "left";
        	
        	bw.write(String.format("%s %s\n", dir, secret.substring(2)));
        }
        
        bw.close();
    } // end of main
} // end of Main class