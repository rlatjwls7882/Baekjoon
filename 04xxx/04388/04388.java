import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 두 수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long A = Long.valueOf(st.nextToken());
        	long B = Long.valueOf(st.nextToken());
        	
        	if(A==0&&B==0) break;
        	
        	// 받아올림이 발생하는 횟수 계산
        	int carry=0, iscarry=0;
        	
        	while(A!=0||B!=0) {
        		
        		if(A%10+B%10+iscarry>9) {
        			carry++;
        			iscarry=1;
        		}
        		else
        			iscarry=0;
        		
        		A/=10; B/=10;
        	}
        	
        	bw.write(carry+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class