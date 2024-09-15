import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	long n = Long.valueOf(br.readLine());
    	int length = (int)(Math.log10(n)+1);
    	
    	int cnt=0;
    	for(int i=0;i<length-1;i++) {
    		if(i>=2) {
    			cnt += 9*Math.pow(10, i/2);
    		} else {
    			cnt += 9;
			}
    	}
    	
    	if(length==1) {
    		cnt=(int)n;
    	} else if(length%2==0) {
    		for(int i=(int)Math.pow(10, length/2-1);;i++) {
    			StringBuilder sb = new StringBuilder(Integer.toString(i));
    			Long val = Long.valueOf(sb.toString()+sb.reverse().toString());
    			if(val>n) {
    				break;
    			}
    			cnt++;
    		}
    	} else {
    		for(int i=(int)Math.pow(10, length/2-1);;i++) {
    			boolean chk=false;
    			for(int j=0;j<=9;j++) {
    				StringBuilder sb = new StringBuilder(Integer.toString(i));
    				Long val = Long.valueOf(sb.toString()+j+sb.reverse().toString());
        			if(val>n) {
        				chk=true;
        				break;
        			}
        			cnt++;
    			}
    			if(chk) {
    				break;
    			}
    		}
    	}
    	bw.write(cnt+"");
    	
        bw.close();
    } // end of main
} // end of Main class