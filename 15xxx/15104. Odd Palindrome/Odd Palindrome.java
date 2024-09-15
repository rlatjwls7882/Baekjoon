import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	String string = br.readLine();
    	int length = string.length();
    	
    	boolean odd=true;
    	for(int i=0;i<length;i++) {
    		for(int j=i+2;j<length;j+=2) {
    			if(chkOdd(string.substring(i, j))) {
    				odd=false;
    				i=j=length;
    				break;
    			}
    		}
    	}
    	
    	if(odd) {
    		bw.write("Odd.");
    	} else {
			bw.write("Or not.");
		}
    	
        bw.close();
    } // end of main
    
    static boolean chkOdd(String string) {
    	int length = string.length();
    	for(int i=0;i<length/2;i++) {
    		if(string.charAt(i)!=string.charAt(length-1-i)) {
    			return false;
    		}
    	}
    	return true;
    } // end of chkOdd()
} // end of Main class