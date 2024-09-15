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
    	
    	// 측정 일수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 배열에 측정값 담기
    	int[] arr = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++)
    		arr[i] = Integer.valueOf(st.nextToken());
    	
    	// 구매 횟수 계산
    	int buy=0;
    	
    	for(int i=0;i<N-1;i++)
    		if(arr[i]<arr[i+1])
    			buy++;
    	
    	// 구매 횟수 출력
    	bw.write(buy+"");
    	bw.close();
    } // end of main
} // end of Main class