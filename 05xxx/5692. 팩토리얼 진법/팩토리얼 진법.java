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
    		String num = bf.readLine();
    		
    		// 0 입력시 종료
    		if(num.equals("0")) break;
    		
    		// 팩토리얼 진법 계산
    		int output=0, factoral=1;
    		for(int i=0;i<num.length();i++) {
    			factoral*=i+1;
    			output+=factoral*(num.charAt(num.length()-1-i)-'0');
    		}
    		
    		// 출력
    		bw.write(output+"\n");
    	}
    	
    	bw.close();
    } // end of main
    
} // end of Main class