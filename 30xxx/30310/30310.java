import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 포크 유형의 수 n
        int n = Integer.valueOf(br.readLine());
        
        // 혼란을 야기시키는데 필요한 최소 포크수 계산(=가장 적은 두 묶음의 포크)
        long[] min = {1000000000L, 1000000000L};
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(n-->0) {
        	long fork = Long.valueOf(st.nextToken());
        	
        	if(min[1]>fork) {
        		min[1] = min[0];
        		min[0] = fork;
        		Arrays.sort(min);
        	}
        }
        
        bw.write(min[0]+min[1]+"");
        
        bw.close();
    } // end of main
} // end of Main class