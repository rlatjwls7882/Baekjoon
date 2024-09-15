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

		// N개의 용액 입력
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		// 0에 가장 가깝게 용액 혼합
		int gap=Integer.MAX_VALUE, left=0, right=N-1;
		int leftVal=0, rightVal=0;
		
		while(left<right) {
			int sum = arr[left]+arr[right];
			int absSum = Math.abs(sum);
			
			if(gap>absSum) {
				leftVal=arr[left];
				rightVal=arr[right];
				gap=absSum;
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