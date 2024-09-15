import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 카이사르 단어 입력
    	String Caesar = br.readLine();
    	
    	// 원래 단어로 고쳐서 출력
    	for(int i=0;i<Caesar.length();i++) {
    		if(Caesar.charAt(i)-'A'<3)
    			bw.write(Caesar.charAt(i)+23);
    		else
    			bw.write(Caesar.charAt(i)-3);
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class