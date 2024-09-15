import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// a, b 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.valueOf(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());

    	// 합의 곱 계산
    	int sum=1;
    	
    	for(int i=a;i<=b;i++) {
    		
    		// (1+2+…+a) * (1+2+…+(a+1)) * … * (1+2+…+(b-1)) * (1+2+…+b)
    		int tmp=0;
    		
    		for(int j=1;j<=i;j++)
    			tmp+=j;
    		
    		sum *= tmp%14579;
    		sum %= 14579;
    	}
    	
    	// 14379로 나눈 나머지 출력
    	bw.write(sum%14579+"");
    	bw.close();
    } // end of main
} // end of Main class