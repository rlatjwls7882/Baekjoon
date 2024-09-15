import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 의견 개수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 의견 입력
    	int[] opinion = new int[N];
    	
    	for(int i=0;i<N;i++)
    		opinion[i]=Integer.valueOf(br.readLine());
    	
    	// 절사된 의견 수 계산
    	int cut = (int)Math.round(N*0.15);
    	
    	// 절사평균 계산
    	Arrays.sort(opinion);
    	
    	int sum=0;
    	for(int i=cut;i<N-cut;i++)
    		sum+=opinion[i];
    	
    	int average = (int)Math.round((double)sum/(N-cut*2));
    	
    	// 절사평균 출력
    	bw.write(average+"");
    	bw.close();
    } // end of main
} // end of Main class