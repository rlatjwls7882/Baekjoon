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
    	
    	while(T-->0) {
    		
    		// 길이가 같은 두 단어 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String A = st.nextToken();
    		String B = st.nextToken();
    		
    		// 각 글자마다 알파벳 거리 계산
    		bw.write("Distances:");
            
    		for(int i=0;i<A.length();i++) {
    			int distance = B.charAt(i)-A.charAt(i);
    			if(distance<0) distance+=26;
    			
    			bw.write(" "+distance);
    		}
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class