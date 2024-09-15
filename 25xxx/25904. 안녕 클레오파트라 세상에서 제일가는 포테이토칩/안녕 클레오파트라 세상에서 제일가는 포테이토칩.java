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
    	
    	// 게임에 참여하는 사람 수 N, 1번이 처음으로 낼 목소리의 높이 X 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int X = Integer.valueOf(st.nextToken());
    	
    	// N명의 최대 목소리의 높이 입력
    	int[] T = new int[N];
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++)
    		T[i] = Integer.valueOf(st.nextToken());
    	
    	// 처음으로 술을 마시는 사람 출력
    	for(int i=0;;i++)
    		if(T[i%N]<X+i) {
    			bw.write((i%N+1)+"");
    			break;
    		}
    	
    	bw.close();
    } // end of main
} // end of Main class