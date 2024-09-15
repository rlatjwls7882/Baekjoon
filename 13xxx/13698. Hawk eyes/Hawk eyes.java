import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// A~F로 이루어진 문자열 입력
    	String input = br.readLine();
    	
    	// 초기 공 위치
    	int smallPos=1, bigPos=4;
    	
    	// 공 위치 변경
    	for(int i=0;i<input.length();i++) {
    		
    		// A
    		if(input.charAt(i)=='A') {
    			if(smallPos==1) smallPos=2;
    			else if(smallPos==2) smallPos=1;
    			
    			if(bigPos==1) bigPos=2;
    			else if(bigPos==2) bigPos=1;
    		}
    		
    		// B
    		else if(input.charAt(i)=='B') {
    			if(smallPos==1) smallPos=3;
    			else if(smallPos==3) smallPos=1;
    			
    			if(bigPos==1) bigPos=3;
    			else if(bigPos==3) bigPos=1;
    		}
    		
    		// C
    		else if(input.charAt(i)=='C') {
    			if(smallPos==1) smallPos=4;
    			else if(smallPos==4) smallPos=1;
    			
    			if(bigPos==1) bigPos=4;
    			else if(bigPos==4) bigPos=1;
    		}
    		
    		// D
    		else if(input.charAt(i)=='D') {
    			if(smallPos==2) smallPos=3;
    			else if(smallPos==3) smallPos=2;
    			
    			if(bigPos==2) bigPos=3;
    			else if(bigPos==3) bigPos=2;
    		}
    		
    		// E
    		else if(input.charAt(i)=='E') {
    			if(smallPos==2) smallPos=4;
    			else if(smallPos==4) smallPos=2;
    			
    			if(bigPos==2) bigPos=4;
    			else if(bigPos==4) bigPos=2;
    		}
    		
    		// F
    		else {
    			if(smallPos==3) smallPos=4;
    			else if(smallPos==4) smallPos=3;
    			
    			if(bigPos==3) bigPos=4;
    			else if(bigPos==4) bigPos=3;
    		}
    	}
    	
    	// 공 위치 입력
    	bw.write(smallPos+"\n"+bigPos);
    	bw.close();
    } // end of main
} // end of Main class