import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	int N = Integer.valueOf(br.readLine());
    	int[][] arr = new int[N][N];
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0;j<N;j++) {
    			arr[i][j] = Integer.valueOf(st.nextToken());
    		}
    	}
    	
    	BigInteger[][] dp = new BigInteger[N][N];
    	for(int i=0;i<N;i++) {
    		Arrays.fill(dp[i], BigInteger.ZERO);
    	}
    	dp[0][0] = BigInteger.ONE;
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			if(arr[i][j]!=0) {
    				if(i+arr[i][j]<N) dp[i+arr[i][j]][j] = dp[i+arr[i][j]][j].add(dp[i][j]);
    				if(j+arr[i][j]<N) dp[i][j+arr[i][j]] = dp[i][j+arr[i][j]].add(dp[i][j]);
    			}
    		}
    	}
    	bw.write(dp[N-1][N-1].toString());
    	
        bw.close();
    } // end of main
} // end of Main class