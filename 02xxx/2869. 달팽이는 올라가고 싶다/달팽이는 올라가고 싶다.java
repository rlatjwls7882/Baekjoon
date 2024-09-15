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
    	
    	// A, B, V 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int V = Integer.valueOf(st.nextToken());
    	
    	// 올라가는데 걸리는 날짜 day 계산
    	// V-A*day+B*(day-1) <= 0
    	double day = Math.ceil((V-B)/(double)(A-B));
    	
    	bw.write((int)day+"");
    	bw.close();
    } // end of main
} // end of Main class