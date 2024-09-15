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
    	
    	// 카드개수 N, 최대값 M
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// N개의 카드 생성
    	int[] arr = new int[N];
    	st = new StringTokenizer(bf.readLine());
    	
    	for(int i=0;i<N;i++)
    		arr[i]=Integer.valueOf(st.nextToken());
    	
    	// M 이하의 세 수의 합중 최대값 찾기
    	int max = 0;
    	
    	for(int i=0;i<N;i++)
    		for(int j=i+1;j<N;j++)
    			for(int k=j+1;k<N;k++)
    				if(max<arr[i]+arr[j]+arr[k]&&arr[i]+arr[j]+arr[k]<=M)
    					max=arr[i]+arr[j]+arr[k];
    	
    	// 최댓값 출력
    	bw.write(max+"");
    	bw.close();
    } // end of main
} // end of Main class