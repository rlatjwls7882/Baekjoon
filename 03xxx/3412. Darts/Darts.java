import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		int n = Integer.valueOf(br.readLine());
    		
    		int point=0;
    		while(n-->0) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			int x = Integer.valueOf(st.nextToken());
    			int y = Integer.valueOf(st.nextToken());
    			double dist = Math.sqrt(x*x+y*y);
    			for(int d=200;d>=20;d-=20) {
    				if(dist<=d) {
    					point++;
    				} else {
    					break;
    				}
    			}
    		}
    		bw.write(point+"\n");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class