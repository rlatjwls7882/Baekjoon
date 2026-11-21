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
    	
    	// a, b, c, d, e, f 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.valueOf(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());
    	int c = Integer.valueOf(st.nextToken());
    	int d = Integer.valueOf(st.nextToken());
    	int e = Integer.valueOf(st.nextToken());
    	int f = Integer.valueOf(st.nextToken());
    	
    	
    	//x, y 계산
    	int x, y;
    	if(a==0) {
    		// y=c/b
    		// x=(bf-ce)/bd
    		
    		y=c/b;
    		x=(b*f-c*e)/(b*d);
    	}
    	
    	else if(d==0) {
    		// y=f/e
    		// x=(ce-bf)/ae
    		
    		y=f/e;
    		x=(c*e-b*f)/(a*e);
    	}
    	
    	else {
    		// y=(cd-af)/(bd-ae)
    		// x=(c-by)/a
    		
    		y=(c*d-a*f)/(b*d-a*e);
    		x=(c-b*y)/a;
    	}
    	
    	// x, y 출력
    	bw.write(x+" "+y);
    	bw.close();
    } // end of main
} // end of Main class