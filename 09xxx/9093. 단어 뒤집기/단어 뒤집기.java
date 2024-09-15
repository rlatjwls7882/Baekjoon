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
    	
    	// 테스트케이스의 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// 문장 입력
    		StringTokenizer sentence = new StringTokenizer(br.readLine());
    
    		// 뒤집어서 출력
    		while(sentence.hasMoreTokens()) {
    			String word = sentence.nextToken();
    			
    			for(int i=word.length()-1;i>=0;i--)
    				bw.write(word.charAt(i));
    			
    			bw.write(" ");
    		}
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class