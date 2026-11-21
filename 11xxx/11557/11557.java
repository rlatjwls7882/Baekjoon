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
        
        while(T--!=0) {
        	
        	// 학교의 숫자 N 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// 술 소비가 가장 많은 학교 계산
        	String school="";
        	int consume=0;
        	
        	while(N--!=0) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		String tmpSchool = st.nextToken();
        		int tmpConsume = Integer.valueOf(st.nextToken());
        		
        		if(tmpConsume>consume) {
        			consume=tmpConsume;
        			school=tmpSchool;
        		}
        	}
        	
        	// 술 소비가 가장 많은 학교 이름 출력
        	bw.write(school+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class