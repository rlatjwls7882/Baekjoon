import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 긴 이름 입력
    	String longName = br.readLine();
    	
    	// 첫번째 글자 출력
    	bw.write(longName.charAt(0));
    	
    	// 2~N번째 글자 출력
    	int index=0;
    	
    	while(longName.indexOf("-",index)!=-1) {
    		
    		bw.write(longName.charAt(longName.indexOf("-",index)+1));
    		
    		index=longName.indexOf("-",index)+1;
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class