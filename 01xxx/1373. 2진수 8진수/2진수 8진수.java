import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	// 2진수 N을 입력
    	String N = String.valueOf(br.readLine());
    	
    	// 2진수 N을 8진수로 변환하여 출력
    	for(int i=N.length()-1;i>=0;i-=3) {
    		
    		// IndexOutOfBoundsException 예외처리
    		if(i-2>=0)
    			sb.append(Integer.valueOf(N.substring(i-2,i+1),2));
    		else
    			sb.append(Integer.valueOf(N.substring(0,i+1),2));
    	}
    	
    	bw.write(sb.reverse()+"");
    	bw.close();
    } // end of main
} // end of Main class