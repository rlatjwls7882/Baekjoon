import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		long sum=0;
		while(st.hasMoreTokens()) {
			arr.add(Integer.valueOf(st.nextToken()));
			sum += arr.get(arr.size()-1);
		}
		sum/=n+1;
		Collections.sort(arr);
		
		ArrayList<Integer> preSum = new ArrayList<>();
		preSum.add(0);
		
		int left=0, right=2*n-1;
		while(left<right) {
			if(arr.get(left)+arr.get(right)==sum) {
				preSum.add(arr.get(left));
				left++;
				right--;
			} else if(arr.get(left)+arr.get(right)<sum) {
				left++;
			} else {
				right--;
			}
		}
		preSum.add((int)sum);
		
		for(int i=1;i<=n;i++) bw.write(preSum.get(i)-preSum.get(i-1)+" ");
        bw.close();
    } // end of main
} // end of Main