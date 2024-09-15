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
    	
    	int N = Integer.valueOf(br.readLine());
    	
    	long minX=-1000000001, minY=-1000000001, maxX=1000000001, maxY=1000000001;
    	while(N-->0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		long x = Long.valueOf(st.nextToken());
    		long y = Long.valueOf(st.nextToken());
    		char LRUD = st.nextToken().charAt(0);
    		
    		if(LRUD=='L') {
    			maxX=Math.min(maxX, x-1);
    		} else if(LRUD=='R') {
    			minX=Math.max(minX, x+1);
    		} else if(LRUD=='D') {
    			maxY=Math.min(maxY, y-1);
    		} else {
    			minY=Math.max(minY, y+1);
    		}
    	}
    	
    	if(minX>maxX||minY>maxY) {
    		bw.write("0");
    	} else if(minX==-1000000001||minY==-1000000001||maxX==1000000001||maxY==1000000001) {
    		bw.write("Infinity");
    	} else {
    		bw.write((maxX-minX+1)*(maxY-minY+1)+"");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class