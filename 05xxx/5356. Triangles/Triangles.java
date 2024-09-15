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
        
        // 삼각형의 요소
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        // 테스트케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 삼각형의 크기, 처음 출력하는 문자 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int length = Integer.valueOf(st.nextToken());
        	int index = st.nextToken().charAt(0)-'A';
        	
        	// 삼각형 출력
        	for(int i=1;i<=length;i++,index++) {
        		for(int j=0;j<i;j++)
        			bw.write(letter.charAt(index%letter.length()));
        		bw.write("\n");
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class