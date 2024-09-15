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
        
        // 뽑을 카드 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // A와 B의 점수 계산
        int A=0, B=0;
        
        while(n--!=0) {
        	
        	// A와 B가 뽑는 카드 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	
        	// A가 뽑은 카드의 숫자가 큰경우
        	if(a>b)
        		A+=a+b;
        	
        	// B가 뽑은 카드의 숫자가 큰경우
        	else if(a<b)
        		B+=a+b;
        	
        	// 같은 숫자를 뽑은 경우
        	else {
        		A+=a;
        		B+=b;
        	}
        }
        
        // A와 B의 점수 출력
        bw.write(A+" "+B);
        bw.close();
    } // end of main
} // end of Main class