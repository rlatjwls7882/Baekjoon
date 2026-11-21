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
    	
    	// a, b, c, d 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = Integer.valueOf(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int c = Integer.valueOf(st.nextToken());
    	int d = Integer.valueOf(st.nextToken());
    	
    	// a b c d 혹은 c d a b로 배열되 페인트 하는 부분이 겹치지 않는 경우
    	if(b<c||d<a)
    		bw.write(b-a+d-c+"");
    	
    	// 겹치는 경우
    	else
    		bw.write(Math.max(b, d)-Math.min(a, c)+"");
    	
    	bw.close();
    } // end of main
} // end of Main class