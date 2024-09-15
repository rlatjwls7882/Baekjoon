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
    	
    	// 세 주사위의 면의 수 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int S1 = Integer.valueOf(st.nextToken());
    	int S2 = Integer.valueOf(st.nextToken());
    	int S3 = Integer.valueOf(st.nextToken());
    	
    	// 세 주사위의 합의 빈도수 계산
    	int[] sums = new int[S1+S2+S3-2];
    	
    	for(int i=0;i<S1;i++)
    		for(int j=0;j<S2;j++)
    			for(int k=0;k<S3;k++)
    				sums[i+j+k]++;
    	
    	// 가장 많이 나오는 합 확인
    	int max=0, maxindex=0;
    	
    	for(int i=0;i<sums.length;i++)
    		if(sums[i]>max) {
    			max=sums[i];
    			maxindex=i;
    		}
    	
    	bw.write(maxindex+3+"");
    	
    	bw.close();
    } // end of main
} // end of Main class