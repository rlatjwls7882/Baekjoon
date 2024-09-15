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
    	
    	// A의 속성
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int attA = Integer.valueOf(st.nextToken());
    	int hpA = Integer.valueOf(st.nextToken());
    	
    	// B의 속성
    	st = new StringTokenizer(bf.readLine());
    	int attB = Integer.valueOf(st.nextToken());
    	int hpB = Integer.valueOf(st.nextToken());
    	
    	// 죽을때까지 맞아야 하는 횟수
    	double hitA = Math.ceil(hpA/(double)attB);
    	double hitB = Math.ceil(hpB/(double)attA);
    	
    	// 살아남은 플레이어 출력
    	if(hitA>hitB)
    		bw.write("PLAYER A");
    	else if(hitB>hitA)
    		bw.write("PLAYER B");
    	else
    		bw.write("DRAW");
    	
    	bw.close();
    } // end of main
} // end of Main class