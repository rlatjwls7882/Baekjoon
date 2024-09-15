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

		// N개의 수 정렬
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(A);
		
		// 두 값을 합쳐서 0에 가장 가까운 값 만들기
		int left=0, right=N-1;
		int gap=Integer.MAX_VALUE, leftVal=0, rightVal=0;
		
		while(left<right) {
			int sum = A[left]+A[right];
			
			if(gap>Math.abs(sum)) {
				leftVal=A[left];
				rightVal=A[right];
				gap = Math.abs(leftVal+rightVal);
			}
			
			if(sum<0) {
				left++;
			} else {
				right--;
			}
		}
		
		bw.write(Integer.toString(leftVal));
		bw.write(' ');
		bw.write(Integer.toString(rightVal));
		
		bw.close();
	} // end of main()
} // end of Main class