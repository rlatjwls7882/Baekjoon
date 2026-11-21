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

        while(true) {
        	
        	// 문자 수 C, 한줄의 문자개수 W, 줄 수 L, 페이지 수 P 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int C = Integer.valueOf(st.nextToken());
        	int W = Integer.valueOf(st.nextToken());
        	int L = Integer.valueOf(st.nextToken());
        	int P = Integer.valueOf(st.nextToken());
        	
        	// 0 0 0 0 입력시 종료
        	if(C==0&&W==0&&L==0&&P==0)
        		break;
        	
        	// 도서관의 책의 개수 출력
        	bw.write((int)Math.pow(C, W*L*P)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class