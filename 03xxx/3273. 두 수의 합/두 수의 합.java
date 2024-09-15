import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// 수열 입력 
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(a);
		
		// 합이 x가 되는 두 수의 쌍의 개수 계산
		int x = Integer.valueOf(br.readLine());
		int i=0, j=n-1, cnt=0;
		
		while(i<j) {
			if(a[i]+a[j]==x) {
				cnt++;
				i++;
			} else if(a[i]+a[j]<x) {
				i++;
			} else {
				j--;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class