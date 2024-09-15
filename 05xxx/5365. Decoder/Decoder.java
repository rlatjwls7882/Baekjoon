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
        
        // 단어의 개수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 각 단어마다 이전 단어의 길이번째 문자 출력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index=0;
        
        while(n-->0) {
        	String word = st.nextToken();
        	
        	try { bw.write(word.charAt(index)); }
        	catch (Exception e) { bw.write(" "); }
        	
        	index = word.length()-1;
        }
        
        bw.close();
    } // end of main
} // end of Main class