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
        
        // 먹는 입의 수 입력
        int n = Integer.valueOf(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=1;i<=n;i++) {
        	
        	// i번째 단어 입력
        	String Ai = st.nextToken();
        	
        	// 올바른 단어가 입력된 경우
        	if(Ai.equals("mumble")||Ai.equals(String.valueOf(i)))
        		continue;
        	
        	// 올바르지 않은 단어가 입력된 경우
        	else {
        		bw.write("something is fishy");
        		bw.close();
        		return;
        	}
        }
        
        // 모두 올바른 단어가 입력된 경우
        bw.write("makes sense");
        bw.close();
    } // end of main
} // end of Main class