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
        
        // 자연수 X, Y 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.valueOf(st.nextToken());
        int Y = Integer.valueOf(st.nextToken());
        
        // 뒤집어진 X, Y의 뒤집어진 결과 출력
        bw.write(Rev(Rev(X)+Rev(Y))+"");
        bw.close();
    } // end of main
    
    // 뒤집어진 수 계산
    public static int Rev(int X) {
    	
    	int length=(int)Math.log10(X);
    	int reversedX=0;
    	
    	while(X>0) {
    		reversedX += X%10*Math.pow(10, length--);
    		X/=10;
    	}
    	
    	return reversedX;
    } // end of Rev
} // end of Main class