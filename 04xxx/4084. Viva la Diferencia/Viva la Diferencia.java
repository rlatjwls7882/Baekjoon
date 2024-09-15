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
    		String string = br.readLine();
    		
    		if(string.equals("0 0 0 0")) break;
    		
    		// a, b, c, d 입력
    		StringTokenizer st = new StringTokenizer(string);
    		int a = Integer.valueOf(st.nextToken());
    		int b = Integer.valueOf(st.nextToken());
    		int c = Integer.valueOf(st.nextToken());
    		int d = Integer.valueOf(st.nextToken());
    		
    		// 몇 번 만에 수렴하는지 계산
    		int num=0;
    		
    		while(!(a==b&&b==c&&c==d)) {
    			int tmpa = Math.abs(a-b);
    			int tmpb = Math.abs(b-c);
    			int tmpc = Math.abs(c-d);
    			int tmpd = Math.abs(d-a);
    			
    			a = tmpa;
    			b = tmpb;
    			c = tmpc;
    			d = tmpd;
    			
    			num++;
    		}
    		
    		// 몇 번 만에 수렴하는지 출력
    		bw.write(num+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class