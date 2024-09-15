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
        	
        	// EOF 처리
        	String string = br.readLine();
        	
        	if(string==null)
        		break;
        	
        	// N w d totalW 입력
        	StringTokenizer st = new StringTokenizer(string);
        	int N = Integer.valueOf(st.nextToken());
        	int w = Integer.valueOf(st.nextToken());
        	int d = Integer.valueOf(st.nextToken());
        	int totalW = Integer.valueOf(st.nextToken());
        	
        	// 총 무게가 totalW일때 가벼운 바구니의 번호 A 계산
        	
        	// 1*w + A(w-d) + 3*w + ... + (N-1)*w = totalW
        	// A = {(1+ +N-1)w - totalW} / d
        	
        	int A = ((N-1)*N/2*w - totalW) / d;
        	
        	// 가벼운 바구니의 번호 출력
        	if(A==0)
        		bw.write(N+"\n");
        	else
        		bw.write(A+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class