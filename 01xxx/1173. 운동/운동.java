import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N, m, M, T, R
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int m = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	int T = Integer.valueOf(st.nextToken());
    	int R = Integer.valueOf(st.nextToken());
    	
    	// 운동을 N분하는데 필요한 시간 계산
    	int requireTime=0, X=m;
    	
    	if(m+T>M) requireTime=-1;
    	else {
    		while(N>0) {
    			if(X+T<=M) {
    				X+=T;
    				N--;
    			} else X-=R;

    			requireTime++;
    			if(X<m) X=m;
    		}
    	}

    	bw.write(requireTime+"");
    	
    	bw.close();
    } // end of main
} // end of Main class