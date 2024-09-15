import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 8진수 N을 입력
    	String N = String.valueOf(br.readLine());
    	
    	// 8진수 N을 2진수로 변환하여 출력
    	char[] octNum = N.toCharArray();
    	
    	for(int i=0;i<octNum.length;i++) {
    		
    		// ex) 1 -> 001로 출력되도록 0삽입
    		if(i!=0&&octNum[i]-'0'<4)
    			bw.write("0");
    		if(i!=0&&octNum[i]-'0'<2)
    			bw.write("0");
    		
    		bw.write(Integer.toBinaryString(octNum[i]-'0')+"");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class