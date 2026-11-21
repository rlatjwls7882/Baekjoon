import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 컴퓨터의 개수 입력
    	int n = Integer.valueOf(bf.readLine());
    	
    	for(int i=1;i<=n;i++) {
    		
    		// 컴퓨터 이름 입력
    		String comName = bf.readLine();
    		
    		// String #1 출력
    		bw.write("String #"+i+"\n");
    		
    		// 입력받은 알파벳의 다음 알파벳 출력
    		for(int j=0;j<comName.length();j++) {
    			if(comName.charAt(j)=='Z')
    				bw.write("A");
    			
    			else
    				bw.write(comName.charAt(j)+1);
    		}
    		bw.write("\n\n");
    		
    	} // end of for(int i=1;i<=n;i++)
    	
    	bw.close();
    } // end of main
} // end of Main class