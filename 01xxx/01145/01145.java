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
		
		// 5개의 자연수 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[5];
		
		for(int i=0;i<5;i++) {
			nums[i] = Integer.valueOf(st.nextToken());
		}
		
		// 가장 작은 적어도 대부분의 배수 계산
		int min = 1000000;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				
				// i와 j의 최소공배수
				int inj = lcm(nums[i], nums[j]);
				
				// i, j, k의 최소공배수 계산
				for(int k=j+1;k<5;k++) {
					min = Math.min(lcm(inj, nums[k]), min);
				}
			}
		}
		
		bw.write(Integer.toString(min));
		
		bw.close();
	} // end of main()
	
	static int lcm(int A, int B) {
		return A*B/gcd(A, B);
	} // end of lcm()
	
	static int gcd(int A, int B) {
		while(B!=0) {
			int tmp = A%B;
			A = B;
			B = tmp;
		}
		return A;
	} // end of gcd()
} // end of Main class