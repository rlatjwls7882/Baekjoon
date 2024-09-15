import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	for(int i=0;i<3;i++) {
    		
    		// 8자리 정수 입력
    		String string = br.readLine();
    		
    		// 가장 긴 연속된 문자의 개수 계산
    		int maxLength=1, curLength=1, lastChar=0;
    		
    		for(int j=0;j<8;j++) {
    			if(lastChar==string.charAt(j)) curLength++;
    			else curLength=1;
    			if(maxLength<curLength) maxLength=curLength;
    			
    			lastChar=string.charAt(j);
    		}
    		bw.write(maxLength+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class