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
    	
    	// 꼭짓점의 개수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 꼭짓점의 x, y좌표 입력
    	int[] x = new int[N];
    	int[] y = new int[N];
    	
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		x[i] = Integer.valueOf(st.nextToken());
    		y[i] = Integer.valueOf(st.nextToken());
    	}
    	
    	// 꼭짓점 사이의 총 거리(건물의 둘레의 길이) 계산
    	int d=0;
    	
    	for(int i=0;i<N;i++) {
    		if(i==0)
    			d += Math.abs((x[i]-x[N-1])+(y[i]-y[N-1]));
    		else
    			d += Math.abs((x[i]-x[i-1])+(y[i]-y[i-1]));
    	}
    	
    	// 건물의 둘레의 길이 출력
    	bw.write(d+"");
    	bw.close();
    } // end of main
} // end of Main class