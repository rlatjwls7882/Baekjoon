import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N 입력
        String N = br.readLine();
        
        // 유진수인지 확인
        String isU = "NO";
        
        for(int i=0;i<N.length()-1;i++) {
        	
        	// 수를 두 부분으로 나눴을때 앞부분 자리수의 곱
        	int x1=1;
        	for(int j=0;j<=i;j++)
        		x1 *= N.charAt(j)-'0';
        	
        	// 수를 두 부분으로 나눴을때 뒷부분 자리수의 곱
        	int x2=1;
        	for(int j=i+1;j<N.length();j++)
        		x2 *= N.charAt(j)-'0';
        	
        	// 두 부분의 곱이 같은 경우
        	if(x1==x2) {
        		isU = "YES";
        		break;
        	}
        }
        
        // N이 유진수인지 출력
        bw.write(isU);

        bw.close();
    } // end of main
} // end of Main class