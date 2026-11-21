import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	String[] H = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
    	String[] M = {"", "", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
    	
    	int h = Integer.valueOf(br.readLine());
    	int m = Integer.valueOf(br.readLine());
    	
    	if(m==0) {
    		bw.write(H[h]+" o' clock");
    	} else if(m<=30) {
    		if(m==30) {
    			bw.write("half past "+H[h]);    			
    		} else if(m==15) {
    			bw.write("quarter past "+H[h]);
    		} else if(m==1) {
				bw.write("one minute past "+H[h]);
			} else {
				bw.write(M[m]+" minutes past "+H[h]);
			}
    	} else {
    		m=60-m;
    		if(m==15) {
    			bw.write("quarter to "+H[h%12+1]);
    		} else if(m==1) {
    			bw.write("one minute to "+H[h%12+1]);
    		} else {
    			bw.write(M[m]+" minutes to "+H[h%12+1]);
    		}
		}
    	
        bw.close();
    } // end of main
} // end of Main class