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
        
        // n개의 정수
        int n = Integer.valueOf(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
        	a[i] = Integer.valueOf(st.nextToken());
        
        // 작업의 개수 m
        int m = Integer.valueOf(br.readLine());
        
        while(m-->0) {
        	
        	// 작업의 종류 kj, 구간 [lj,rj]
        	st = new StringTokenizer(br.readLine());
        	int kj = Integer.valueOf(st.nextToken());
        	int lj = Integer.valueOf(st.nextToken());
        	int rj = Integer.valueOf(st.nextToken());
        	
        	// 1번 작업
        	if(kj==1)
        		for(int i=lj-1;i<rj;i++)
        			a[i] = a[i]*a[i]%2010;
        	
        	// 2번 작업
        	else {
        		int sum=0;
        		
        		for(int i=lj-1;i<rj;i++)
        			sum += a[i];
        		
        		bw.write(sum+"\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class