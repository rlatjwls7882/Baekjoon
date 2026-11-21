import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		String string = bf.readLine();
    		
    		// *** 입력시 종료
    		if(string.equals("***")) break;
    		
    		// 문자열을 거꾸로 출력
    		for(int i=string.length()-1;i>=0;i--)
    			bw.write(string.charAt(i)+"");
    		
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class