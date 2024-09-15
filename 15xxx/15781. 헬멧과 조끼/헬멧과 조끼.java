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
    	
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// N 입력
    	int maxN=0;
    	st = new StringTokenizer(bf.readLine());
    	while(N--!=0) {
    		int tmp = Integer.valueOf(st.nextToken());
    		if(maxN<tmp) maxN=tmp;
    	}
    	
    	// M 입력
    	int maxM=0;
    	st = new StringTokenizer(bf.readLine());
    	while(M--!=0) {
    		int tmp = Integer.valueOf(st.nextToken());
    		if(maxM<tmp) maxM=tmp;
    	}
    	
    	// N과 M의 최댓값 출력
    	bw.write(maxM+maxN+"");
    	bw.close();
    } // end of main
} // end of Main class