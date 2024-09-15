import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(bf.readLine());
    	
    	// 생성자가 출력되었는지 확인
    	boolean isNotWrite = true;
    	
    	// N의 생성자 찾기
    	for(int i=1;i<N;i++) {
    		
    		// i로 만들수 있는 분배합 확인
    		int M=i;
    		int tmp=M;
    		
    		while(tmp!=0) {
    			M+=tmp%10;
    			tmp/=10;
    		}
    		
    		// 조건을 만족하는 최소 생성자 출력
    		if(M==N) {
    			bw.write(i+"");
    			isNotWrite=false;
    			break;
    		}
    	}
    	
    	// 조건을 만족하는 생성자가 없는 경우
    	if(isNotWrite)
    		bw.write("0");
    	
    	bw.close();
    } // end of main
} // end of Main class