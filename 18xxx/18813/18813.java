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
        
        // 단어의 수 n, 대회의 문제의 수 m 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        
        // 철자를 댈 수 있는 단어의 수 계산
        int num=0;
        
        while(n-->0) {
        	try {
        		
        		// 필요한 알파벳이 없거나 2번 이상 나오면 예외 발생
        		String word = br.readLine();
				int[] alphabet = new int[m];
        		
        		for(int i=0;i<word.length();i++) {
        			alphabet[word.charAt(i)-'A']++;
        			
        			if(alphabet[word.charAt(i)-'A']>1)
        				throw new Exception();
        		}
        		
        		// 예외가 발생하지 않는 경우
        		num++;
			} catch (Exception e) {}
        }
        
        // 철자를 댈 수 있는 단어의 수 출력
        bw.write(num+"");
        bw.close();
    } // end of main
} // end of Main class