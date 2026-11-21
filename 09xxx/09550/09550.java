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

    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int K = Integer.valueOf(st.nextToken());
    		
    		int peopleNum=0;
    		st = new StringTokenizer(bf.readLine());
    		
    		while(N--!=0)
    			peopleNum += Integer.valueOf(st.nextToken())/K;
    		
    		bw.write(peopleNum+"\n");
    		
    	} // end of while(T--!=0)
    	
    	bw.close();
    } // end of main
} // end of Main class