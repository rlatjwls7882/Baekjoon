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
    	
    	// 주차요금 A, B, C 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 트럭 3대의 주차 시간 확인
    	int[] parking = new int[100];
    	
    	for(int i=0;i<3;i++) {
    		st = new StringTokenizer(br.readLine());
    		int start = Integer.valueOf(st.nextToken());
    		int end = Integer.valueOf(st.nextToken());
    		
    		while(start++<end)
    			parking[start-1]++;
    	}
    	
    	// 주차 요금 계산
    	int fee=0;
    	for(int i=0;i<100;i++)
    		if(parking[i]==0) continue;
    		else if(parking[i]==1) fee+=A;
    		else if(parking[i]==2) fee+=2*B;
    		else fee+=3*C;
    	
    	bw.write(fee+"");
    	
    	bw.close();
    } // end of main
} // end of Main class