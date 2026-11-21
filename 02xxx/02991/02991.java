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
    	
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	int D = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(bf.readLine());
    	
    	for(int i=0;i<3;i++) {
    		// 집에 도착하는 사람
    		int P = Integer.valueOf(st.nextToken());
    		
    		// 개의 수
    		int dogs=0;
    		
    		// 첫번째 개
    		int P1=P%(A+B);
    		
    		if(1<=P1&&P1<=A)
    			dogs++;
    		
    		// 두번째 개
    		int P2=P%(C+D);
    		
    		if(1<=P2&&P2<=C)
    			dogs++;
    		
    		// 사람을 공격하는 개의 수 출력
    		bw.write(dogs+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class