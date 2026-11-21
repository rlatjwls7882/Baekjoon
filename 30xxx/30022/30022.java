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
        
        // 총 구매하는 물건의 개수 N, 상점1에서 구매하는 개수 A 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int A = Integer.valueOf(st.nextToken());
        
        // 상점1 - 상점2의 가격, 총 소비금액 입력
        long spend=0;
        int[] diff = new int[N];
        
        for(int i=0;i<N;i++) {
        	st = new StringTokenizer(br.readLine());
        	int store1 = Integer.valueOf(st.nextToken());
        	int store2 = Integer.valueOf(st.nextToken());
        	
        	diff[i] = store1 - store2;
        	spend += store1 + store2;
        }
        
        // 최소 소비 금액 계산
        // A : (stor1+store2+diff)/2, B : (stor1+store2-diff)/2
        
        Arrays.sort(diff);
        
        for(int i=0;i<A;i++)
        	spend += diff[i];

        for(int i=A;i<N;i++)
        	spend -= diff[i];
        
        // 최소 소비 금액 출력
        bw.write(spend/2+"");
        bw.close();
    } // end of main
} // end of Main class