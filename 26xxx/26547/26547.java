import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 데이터 세트의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 이불을 만들 단어 입력
        	String word = br.readLine();
        	
        	// 이불 출력
        	for(int i=0;i<word.length();i++) {
        		
        		// 첫번째 줄
        		if(i==0)
        			bw.write(word+"\n");
        		
        		// 마지막 줄
        		else if(i==word.length()-1) {
        			for(int j=word.length()-1;j>=0;j--)
        				bw.write(word.charAt(j));
        			bw.write("\n");
        		}
        		
        		// 2~length-1번째 줄
        		else {
        			
        			// 첫번째 글자
        			bw.write(word.charAt(i));
        			
        			// 네모 속 공백
        			for(int j=0;j<word.length()-2;j++)
        				bw.write(" ");
        			
        			// 마지막 글자
        			bw.write(word.charAt(word.length()-1-i)+"\n");
        		}
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class