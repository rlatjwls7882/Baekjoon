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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.valueOf(st.nextToken());
    	int m = Integer.valueOf(st.nextToken());
    	
    	int cnt0=0, cnt1=0;
    	boolean type1=true, type2=true;
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<m;j++) {
    			int next = Integer.valueOf(st.nextToken());
    			if(next==1) {
    				cnt1++;
    				if((i+j)%2==0) type1=false;
    				else type2=false;
    			} else {
    				cnt0++;
    				if((i+j)%2==0) type2=false;
    				else type1=false;
    			}
    		}
    	}
    	
    	// Case1
    	// 1 0 1 0
    	// 0 1 0 1
    	// 1 0 1 0

    	// Case2
    	// 0 1 0 1
    	// 1 0 1 0
    	// 0 1 0 1
    	
    	// Case3
    	// 1 0
    	// 1 1
    	if(type1 || type2 || cnt0%2!=0 || cnt1%2!=0) {
    		bw.write("-1");
    	} else {
    		bw.write("1");
    	}
    	
        bw.close();
    } // end of main
} // end of Main