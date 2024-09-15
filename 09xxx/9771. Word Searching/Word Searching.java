import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 검색할 단어 입력
        String word = br.readLine();
        
        // 단어가 등장한 횟수 계산
        int cnt=0;
        
        while(true) {
        	
        	// 문장 입력
        	String sentence = br.readLine();
        	
        	if(sentence==null) break;
        	
        	// 문장에서 단어 검색
        	int index=0;
        	
        	while(sentence.indexOf(word,index)!=-1) {
        		cnt++;
        		index = sentence.indexOf(word,index)+1;
        	}
        }
        
        // 단어가 등장한 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class