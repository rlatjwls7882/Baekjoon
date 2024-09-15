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

		// 수열의 크기 N, 변형 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 크기 N의 수열
		st = new StringTokenizer(br.readLine(),",");
		int[] array = new int[N];
		for(int i=0;i<N;i++)
			array[i] = Integer.valueOf(st.nextToken());
		
		// K번 변형
		for(int i=N-1;i>N-1-K;i--)
			for(int j=0;j<i;j++)
				array[j]=array[j+1]-array[j];
		
		// 결과 출력
		for(int i=0;i<N-K;i++) {
			if(i!=0) bw.write(",");
			bw.write(array[i]+"");
		}
		
		bw.close();
	} // end of main
} // end of Main class