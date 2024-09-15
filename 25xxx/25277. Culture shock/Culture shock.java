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
        
        // 전기충격 맞는 단어
        String[] doNotSay = {"he", "him", "she", "her"};
        
        // 단어의 수 N, 문장 입력
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 전기충격 맞은 횟수 계산
        int shockNum=0;
        
        while(N--!=0) {
        	
        	String word = st.nextToken();
        	
        	for(int i=0;i<doNotSay.length;i++)
        		if(doNotSay[i].equals(word)) {
        			shockNum++;
        			break;
        		}
        }
        
        // 전기충격 맞은 횟수 출력
        bw.write(shockNum+"");
        bw.close();
    } // end of main
} // end of Main class