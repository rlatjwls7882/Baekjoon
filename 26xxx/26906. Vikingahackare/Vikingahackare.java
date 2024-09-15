import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // T개의 룬석 번역 방법 입력
        int T = Integer.valueOf(br.readLine());
        HashMap<String, Character> rune = new HashMap<String, Character>();
        
        while(T-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	char letter = st.nextToken().charAt(0);
        	rune.put(st.nextToken(), letter);
        }
        
        // 룬석 번역
        String N = br.readLine();
        
        for(int i=0;i<N.length();i+=4) {
        	try {
				bw.write(rune.get(N.substring(i,i+4)));
			} catch (Exception e) {
				bw.write("?");
			}
        }
        
        bw.close();
    } // end of main
} // end of Main class