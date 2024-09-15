import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 암호화된 문장의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 문장을 복호화하여 출력
        char[] original = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] replacement = {'y', 'a', 'e', 'i', 'o', 'u'};
        
        while(n-->0) {
        	
        	String string = br.readLine();
        	
        	replaced:
        	for(int i=0;i<string.length();i++) {
        		
        		// 암호화된 문자
        		for(int j=0;j<6;j++)
        			if(string.charAt(i)==replacement[j]) {
        				bw.write(original[j]);
        				continue replaced;
        			}
        			else if(string.charAt(i)==replacement[j]-32) {
        				bw.write(original[j]-32);
        				continue replaced;
        			}
        		
        		// 암호화되지 않은 문자
        		bw.write(string.charAt(i));
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class