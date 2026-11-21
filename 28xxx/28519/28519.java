import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// X, Y 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int X = Integer.valueOf(st.nextToken());
    	int Y = Integer.valueOf(st.nextToken());
    	
    	// 두 수의 차이가 1이하인 경우
    	if(Math.abs(X-Y)<2)
    		bw.write(X+Y+"");
    	
    	// 최대 개수 X(X+1)개
    	else {
    		if(X<Y)
    			bw.write(X*2+1+"");
    		else
    			bw.write(Y*2+1+"");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class