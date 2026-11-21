import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// m개의 정수 입력
        	int m = Integer.valueOf(br.readLine());
        	
        	// 테스트 케이스 출력
        	bw.write(String.format("Case %d:\n", i)+"");
        	
        	// 학교에 다니는 학생의 학년 출력
        	while(m--!=0) {
        		int grade = Integer.valueOf(br.readLine());
        		
        		if(grade<6)
        			bw.write(grade+1+"\n");
        	}
        }
        	
        bw.close();
    } // end of main
} // end of Main class