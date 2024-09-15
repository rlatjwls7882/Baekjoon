import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 단어의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        HashSet<String> password = new HashSet<String>();
        
        while(N-->0) {
        	
        	String word = br.readLine();
        	
        	// 뒤집어진 단어가 목록에 존재하는 경우
        	if(password.contains(word))
        		bw.write(word.length()+" "+word.charAt(word.length()/2));
        	
        	// 뒤집어진 단어가 목록에 존재하지 않는 경우
        	else {
        		StringBuilder sb = new StringBuilder();
        		
        		// 문자열 뒤집기
        		for(int i=word.length()-1;i>=0;i--)
        			sb.append(word.charAt(i));
        		
        		// 문자열을 뒤집기 전과 후가 같은 경우
        		if(word.equals(sb.toString())) {
        			bw.write(word.length()+" "+word.charAt(word.length()/2));
        			break;
        		}
        		
        		password.add(sb.toString());
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class