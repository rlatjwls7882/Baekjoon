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
        
        // NFP 수 n, 행렬의 행의 수 r
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int r = Integer.valueOf(st.nextToken());
        
        while(n-->0) {
        	
        	// NFP값 입력
        	String[] NFP = new String[r];
        	for(int i=0;i<r;i++)
        		NFP[i] = br.readLine();
        	
        	// NFP의 최대값과 최솟값 계산
        	int max=0, min=50;
        	
        	for(int i=0;i<r;i++)
        		if(NFP[i].indexOf('#')!=-1) {
        			if(max<r-i) max = r-i;
        			if(min>r-i) min = r-i;
        		}
        	
        	// NFP의 불안정성 출력
        	bw.write(max-min+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class