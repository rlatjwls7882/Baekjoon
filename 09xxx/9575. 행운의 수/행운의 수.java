import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		int N = Integer.valueOf(br.readLine());
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int[] A = new int[N];
    		for(int i=0;i<N;i++) {
    			A[i] = Integer.valueOf(st.nextToken());
    		}
    		
    		int M = Integer.valueOf(br.readLine());
    		st = new StringTokenizer(br.readLine());
    		int[] B = new int[M];
    		for(int i=0;i<M;i++) {
    			B[i] = Integer.valueOf(st.nextToken());
    		}
    		
    		int K = Integer.valueOf(br.readLine());
    		st = new StringTokenizer(br.readLine());
    		int[] C = new int[K];
    		for(int i=0;i<K;i++) {
    			C[i] = Integer.valueOf(st.nextToken());
    		}
    		
    		HashSet<Integer> nums = new HashSet<>();
    		for(int i=0;i<N;i++) {
    			for(int j=0;j<M;j++) {
    				for(int k=0;k<K;k++) {
    					int val = A[i]+B[j]+C[k];
    					boolean chk=true;
    					while(val!=0) {
    						if(val%10!=5&&val%10!=8) {
    							chk=false;
    							break;
    						}
    						val/=10;
    					}
    					if(!chk) {
    						continue;
    					}
    					nums.add(A[i]+B[j]+C[k]);
    				}
    			}
    		}
    		bw.write(nums.size()+"\n");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class