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
    	
    	// N M 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// N개의 바구니 생성
    	int[] arr = new int[N];
    	for(int i=0;i<N;i++)
    		arr[i]=i+1;
    	
    	// M번 바구니 순서 바꾸기
    	while(M--!=0) {
    		st = new StringTokenizer(bf.readLine());
    		int i = Integer.valueOf(st.nextToken());
    		int j = Integer.valueOf(st.nextToken());
    		
    		 // ex) 1 4 / 1->4 4->1 2->3 3->2
    		for(int k=0;k<(j-i+1)/2.0;k++) {
    			int tmp = arr[i-1+k];
    			arr[i-1+k] = arr[j-1-k];
    			arr[j-1-k] = tmp;
    		}
    	}
    	
    	// 바구니 순서 출력
    	for(int i=0;i<N;i++)
    		bw.write(arr[i]+" ");
    	
    	bw.close();
    } // end of main
} // end of Main class