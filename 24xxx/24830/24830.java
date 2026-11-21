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
        
        // 계산기에 입력할 명령의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 명령 수행
        long before=1;
        
        while(n-->0) {
        	
        	// 정수 a, 연산자 op, 정수 b 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long a = Long.valueOf(st.nextToken());
        	char op = st.nextToken().charAt(0);
        	long b = Long.valueOf(st.nextToken());
        	
        	// 곱하기
        	if(op=='*')
        		before = a*a*b*b;
        	
        	// 나누기
        	else if(op=='/')
        		before = (a+1)/2;
        	
        	// 더하기
        	else if(op=='+')
        		before = a+b-before;
        	
        	// 빼기
        	else
        		before = (a-b)*before;
        	
        	// 결과 출력
        	bw.write(before+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class