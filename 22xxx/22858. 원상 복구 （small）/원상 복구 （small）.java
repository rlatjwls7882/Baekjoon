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
    	int N = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int[] S = new int[N];
    	for(int i=0;i<N;i++) {
    		S[i] = Integer.valueOf(st.nextToken());
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	int[] D = new int[N];
    	for(int i=0;i<N;i++) {
    		D[i] = Integer.valueOf(st.nextToken());
    	}
    	
    	while(K-->0) {
    		int[] newS = new int[N];
    		for(int i=0;i<N;i++) {
    			newS[D[i]-1] = S[i];
    		}
    		S = newS;
    	}
    	
    	for(int i=0;i<N;i++) {
    		bw.write(S[i]+" ");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class