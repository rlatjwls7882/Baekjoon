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
    	
    	// 바구니수 N, 교환 M
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int N = Integer.valueOf(st.nextToken()); 
    	int M = Integer.valueOf(st.nextToken()); 
    	
    	// 바구니 생성
    	int[] basket = new int[N];
    	
    	for(int i=0;i<N;i++)
    		basket[i]=i+1;
    	
    	// 바구니에 들어있는 공 교환
    	while(M--!=0) {
    		st = new StringTokenizer(bf.readLine());
    		int i = Integer.valueOf(st.nextToken());
    		int j = Integer.valueOf(st.nextToken());
    		
    		int tmp = basket[i-1];
    		basket[i-1] = basket[j-1];
    		basket[j-1] = tmp;
    	}
    	
    	// 바구니에 들어 있는 공 출력
    	for(int i=0;i<N;i++)
    		bw.write(basket[i]+" ");
    	
    	bw.close();
    } // end of main
} // end of Main class