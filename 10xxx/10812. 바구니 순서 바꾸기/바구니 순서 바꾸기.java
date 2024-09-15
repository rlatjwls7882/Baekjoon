import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 바구니 수 N, 회전 수 M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 바구니 생성
        int[] basket = new int[N];
        
        for(int i=0;i<N;i++)
        	basket[i] = i+1;
        
        while(M--!=0) {
        	
        	// i, j, k 입력
        	st = new StringTokenizer(br.readLine());
        	int i = Integer.valueOf(st.nextToken())-1;
        	int j = Integer.valueOf(st.nextToken())-1;
        	int k = Integer.valueOf(st.nextToken())-1;
        	
        	// j~k, i~k-1 순서의 새로운 바구니 생성
        	ArrayList<Integer> tmp = new ArrayList<Integer>();
        	
        	for(int l=k;l<=j;l++)
        		tmp.add(basket[l]);
        	
        	for(int l=i;l<=k-1;l++)
        		tmp.add(basket[l]);
        	
        	// 새로 생성한 바구니로 기존 바구니 변경
        	for(int l=0;l<tmp.size();l++)
        		basket[i++] = tmp.get(l);
        }
        
        // 바구니 순서 출력
        for(int i=0;i<N;i++)
        	bw.write(basket[i]+" ");
        
        bw.close();
    } // end of main
} // end of Main class