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
    	
    	// 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int H = Integer.valueOf(st.nextToken());
    	int W = Integer.valueOf(st.nextToken());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// (M+1)(N+1) 크기의 공간으로 분리
    	int peopleNum = (int)(Math.ceil((double)W/(M+1))*Math.ceil((double)H/(N+1)));
    	
    	// 출력
    	bw.write(peopleNum+"");
    	bw.close();
    } // end of main
    
} // end of Main class