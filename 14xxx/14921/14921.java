import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// N개의 용액을 오름차순으로 입력
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 두 용액을 혼합하여 0에 가장 가까운 B 계산
		int left=0, right=N-1, B=1_000_000_000;
		
		while(left<right) {
			int sum = A[left]+A[right];
			int absSum = Math.abs(sum);
			
			if(absSum<Math.abs(B)) {
				B=sum;
			}
			
			if(sum>0) {
				right--;
			} else {
				left++;
			}
		}
		
		bw.write(Integer.toString(B));
		
		bw.close();
	} // end of main()
} // end of Main class