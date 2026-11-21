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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 쌀포대의 최대 무게 계산
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int max=0;
        	
        	for(int j=0;j<5;j++) {
        		int tmp = Integer.valueOf(st.nextToken());
        		
        		if(max<tmp) max=tmp;
        	}
        	
        	// 쌀포대의 최대 무게 출력
        	bw.write("Case #"+i+": "+max+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class