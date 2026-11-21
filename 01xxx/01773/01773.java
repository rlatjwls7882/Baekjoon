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
    	
    	// 학생의 수 N, 폭죽쇼가 끝나는 시간 C
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 폭죽이 터지는 시간 계산
    	int[] fireworks = new int[C];
    	
    	while(N-->0) {
    		int tmp = Integer.valueOf(br.readLine());
    		
    		for(int i=tmp;i<=C;i+=tmp)
    			fireworks[i-1]=1;
    	}
    	
    	// 폭죽을 볼 수 있는 횟수 계산
    	int canSee=0;
    	for(int i=0;i<C;i++)
    		if(fireworks[i]==1)
    			canSee++;
    	
    	bw.write(canSee+"");
    	
    	bw.close();
    } // end of main
} // end of Main class