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
    	
    	// 테스트 케이스의 수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		
    		// 오타를 낸 위치와 입력한 문자열
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int index = Integer.valueOf(st.nextToken())-1;
    		String string = st.nextToken();
    		
    		// 오타를 지운 문자열 출력
    		for(int i=0;i<string.length();i++)
    			if(i!=index)
    				bw.write(string.charAt(i));
    		bw.write("\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class