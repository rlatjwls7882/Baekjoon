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
    	
    	// 대문자로 이루어진 단어 입력
    	StringTokenizer word = new StringTokenizer(br.readLine(),"CAMBRIDGE");
    	
    	// 단어를 검열하여 출력
    	while(word.hasMoreTokens())
    		bw.write(word.nextToken()+"");
    	
    	bw.close();
    } // end of main
} // end of Main class