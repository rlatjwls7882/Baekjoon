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
    	
    	// A, B, C 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 로그인해야 하는 횟수 계산
    	int loginNum=0;
    	
    	// 일주일보다 오래 걸리는 경우
    	if(C>=7*A+B) {
    		loginNum += (C/(7*A+B))*7;
    		C %= 7*A+B;
    	}
    	
    	// 일주일보다 적게 걸리는 경우
    	for(int i=1;C>0;i++) {
    		if(i%7==0) C-=B;
    		C-=A;
    		loginNum++;
    	}
    	
    	// 로그인해야 하는 횟수 출력
    	bw.write(loginNum+"");
    	bw.close();
    } // end of main
} // end of Main class