import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.valueOf(bf.readLine());
    	
    	while(N--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int X = Integer.valueOf(st.nextToken());
    		int Y = Integer.valueOf(st.nextToken());
    		
    		if(X>=Y) bw.write("MMM BRAINS\n");
    		else bw.write("NO BRAINS\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class