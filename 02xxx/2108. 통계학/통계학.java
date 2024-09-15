import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());

		// N개의 수 입력
		TreeMap<Integer, Integer> nums = new TreeMap<>();
		int sum=0, min=4000, max=-4000;

		for(int i=0;i<N;i++) {
			int tmp = Integer.valueOf(br.readLine());

			nums.put(tmp, nums.getOrDefault(tmp, 0)+1);

			sum += tmp;
			if(min>tmp) min=tmp;
			if(max<tmp) max=tmp;
		}

		// 산술평균
		bw.write(Math.round(sum/(double)N)+"\n");
		
		// 중앙값
		sum=0;
		for(int i:nums.keySet()) {
			sum += nums.get(i);
			
			if(sum>=(N+1)/2) {
				bw.write(i+"\n");
				break;
			}
		}
		
		// 최빈값
		int modeVal=0;
		for(int i:nums.values())
			if(modeVal<i) modeVal=i;
		
		int idx=0, modeKey=0;
		for(int i:nums.keySet())
			if(modeVal==nums.get(i)) {
				modeKey=i;
				idx++;
				if(idx==2) break;
			}
		bw.write(modeKey+"\n");
		
		// 범위
		bw.write(max-min+"\n");

		bw.close();
	} // end of main
} // end of Main class