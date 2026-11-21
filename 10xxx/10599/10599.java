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
    	
    	while(true) {
    		String string = bf.readLine();
    		StringTokenizer st = new StringTokenizer(string);
    		
    		// 0 0 0 0이 입력될때 종료
    		if(string.equals("0 0 0 0")) break;
    		
    		// 출생일 사망일 입력
    		int birthMin = Integer.valueOf(st.nextToken());
    		int birthMax = Integer.valueOf(st.nextToken());
    		int dieMin = Integer.valueOf(st.nextToken());
    		int dieMax = Integer.valueOf(st.nextToken());
    		
    		// 최소나이, 최대나이 출력
    		bw.write((dieMin-birthMax)+" "+(dieMax-birthMin)+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class