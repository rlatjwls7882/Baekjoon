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
    		
    		// 0 0 0 0 입력시 종료
    		if(string.equals("0 0 0 0")) break;
    		
    		// 현재시간 h1 m1, 자명종이 울리는 시간 h2 m2 입력
    		StringTokenizer st = new StringTokenizer(string);
    		int h1 = Integer.valueOf(st.nextToken());
    		int m1 = Integer.valueOf(st.nextToken());
    		int h2 = Integer.valueOf(st.nextToken());
    		int m2 = Integer.valueOf(st.nextToken());
    		
    		// 잠을 자는 시간 계산
    		int time = (h2-h1)*60+(m2-m1);
    		if(time<0) time += 60*24;
    		
    		// 잠을 자는 시간 출력
    		bw.write(time+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class