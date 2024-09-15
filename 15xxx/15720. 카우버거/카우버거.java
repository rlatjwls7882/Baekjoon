import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		// 버거
		st = new StringTokenizer(br.readLine());
		Integer[] burgur = new Integer[B];
		for(int i=0;i<B;i++) {
			burgur[i] = Integer.valueOf(st.nextToken());
		}
		
		// 사이드
		st = new StringTokenizer(br.readLine());
		Integer[] side = new Integer[C];
		for(int i=0;i<C;i++) {
			side[i] = Integer.valueOf(st.nextToken());
		}
		
		// 음료
		st = new StringTokenizer(br.readLine());
		Integer[] drink = new Integer[D];
		for(int i=0;i<D;i++) {
			drink[i] = Integer.valueOf(st.nextToken());
		}
		
		// 세트 할인 전의 가격 출력
		int sum=0;
		for(int i=0;i<B;i++) {
			sum += burgur[i];
		}
		for(int i=0;i<C;i++) {
			sum += side[i];
		}
		for(int i=0;i<D;i++) {
			sum += drink[i];
		}
		
		bw.write(Integer.toString(sum));
		bw.newLine();
		
		// 세트 할인 후의 가격 출력
		Arrays.sort(burgur, Collections.reverseOrder());
		Arrays.sort(side, Collections.reverseOrder());
		Arrays.sort(drink, Collections.reverseOrder());
		int cnt= Math.min(Math.min(B, C), D);
		
		for(int i=0;i<cnt;i++) {
			sum -= (burgur[i]+side[i]+drink[i])/10;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class