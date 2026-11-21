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
    	int cnt=0;
    	for(int i=0;i<string.length();i++) {
    		if(string.charAt(i)=='1') {
    			cnt++;
    		}
    	}
    	
    	string = string.replace("1", "");
    	int idx=-1;
    	for(int i=0;i<string.length();i++) {
    		if(string.charAt(i)=='0') {
    			idx=i;
    		} else {
				break;
			}
    	}
    	
    	for(int i=string.length()-1;i>idx;i--) {
    		if(string.charAt(i)=='0') {
    			cnt += 9;
    		} else {
				cnt += string.charAt(i)-'0';
			}
    	}
    	bw.write(cnt+"");
    	
        bw.close();
    } // end of main
} // end of Main class