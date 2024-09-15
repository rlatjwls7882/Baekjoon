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
    	
    	// a, b, x, y 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.valueOf(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());
    	int x = Integer.valueOf(st.nextToken());
    	int y = Integer.valueOf(st.nextToken());
    	
    	// case1 : a -> b
    	int case1 = Math.abs(a-b);
    	
    	// case2 : a -> x, y -> b
    	int case2 = Math.abs(a-x)+Math.abs(b-y);
    	
    	// case3 : a -> y, x -> b
    	int case3 = Math.abs(a-y)+Math.abs(b-x);
    	
    	// 제일 작은 값 출력
    	if(case1<=case2&&case1<=case3)
    		bw.write(case1+"");
    	
    	else if(case2<=case3)
    		bw.write(case2+"");
    	
    	else
    		bw.write(case3+"");
    	
    	bw.close();
    } // end of main
} // end of Main class