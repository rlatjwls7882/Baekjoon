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
    	
    	String string;
    	while((string = br.readLine())!=null) {
    		
    		// 먹은 핫도그의 수 H, 대회 참가자수 P 입력
    		StringTokenizer st = new StringTokenizer(string);
    		double H = Double.valueOf(st.nextToken());
    		double P = Double.valueOf(st.nextToken());
    		
    		// 참가자가 먹은 핫도그 수의 평균 출력
    		bw.write(String.format("%.2f", H/P)+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class