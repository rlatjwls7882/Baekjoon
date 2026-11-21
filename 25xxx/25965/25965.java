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

        // 게임의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        for(int i=0;i<N;i++) {
        	
        	// 미션의 수 M 입력
        	int M = Integer.valueOf(br.readLine());
        	
        	// M개의 미션 입력
        	long[][] mission = new long[M][3];
        	
        	for(int j=0;j<M;j++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		
        		for(int k=0;k<3;k++)
        			mission[j][k] = Long.valueOf(st.nextToken());
        	}
        	
        	// K D A 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] KDA = new int[3];
        	
        	for(int j=0;j<3;j++)
        		KDA[j] = Integer.valueOf(st.nextToken());
        	
        	// 총 도네이션 금액 계산
        	long sum=0;
        	
        	for(long[] price:mission)
        		if(price[0]*KDA[0]-price[1]*KDA[1]+price[2]*KDA[2]>0) {
        			sum += price[0]*KDA[0]-price[1]*KDA[1]+price[2]*KDA[2];
        		}
        	
        	// 총 도네이션 금액 출력
        	bw.write(sum+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class