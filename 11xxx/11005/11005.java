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
    	
    	// 숫자와 진법 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int num = Integer.valueOf(st.nextToken());
    	int scale = Integer.valueOf(st.nextToken());
    	
    	// scale 진법으로 변환하여 출력
    	bw.write(Integer.toString(num, scale).toUpperCase()+"");
    	bw.close();
    } // end of main
} // end of Main class