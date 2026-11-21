import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		String s = br.readLine();
    		
    		// 0 입력시 종료
    		if(s.equals("0")) break;
    		
    		// 맨 앞부터 순서대로 비교
    		boolean isPalindrome=true;
    		
    		for(int i=0;i<s.length()/2;i++)
    			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
    				isPalindrome=false;
    				break;
    			}
    		
    		if(isPalindrome)
    			bw.write("yes\n");
    		else
    			bw.write("no\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class