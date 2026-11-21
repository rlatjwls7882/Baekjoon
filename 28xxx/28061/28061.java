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
    	
    	// 나무의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 집에 들고 갈 수 있는 레몬의 최대개수 계산
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int max=0;
    	for(int i=0;i<N;i++) {
    		int lemon = Integer.valueOf(st.nextToken())-(N-i);
    		
    		if(max<lemon) max=lemon;
    	}
    	
    	// 레몬의 최대 개수 출력
    	bw.write(max+"");
    	bw.close();
    } // end of main
} // end of Main class