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
    	
    	// 테스트 케이스 T
    	int T = Integer.valueOf(bf.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		
    		// 삼각형의 길이 입력
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		int C = Integer.valueOf(st.nextToken());
    		
    		// 출력
    		bw.write("Case #"+i+": ");
    		
    		// 정삼각형
    		if(A==B&&A==C)
    			bw.write("equilateral\n");
    		
    		// 삼각형 성립X
    		else if((A>B&&A>C&&A>=B+C)||(B>A&&B>C&&B>=A+C)||(C>A&&C>B&&C>=A+B))
    			bw.write("invalid!\n");
    		
    		// 이등변 삼각형
    		else if(A==B||A==C||B==C)
    			bw.write("isosceles\n");
    		
    		// 부등변 삼각형
    		else
    			bw.write("scalene\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class