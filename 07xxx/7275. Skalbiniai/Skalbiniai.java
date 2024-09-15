import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		ArrayList<ArrayList<Integer>> groupList = new ArrayList<>();
		for(int i=0;i<K;i++) {
			groupList.add(new ArrayList<>());
			st = new StringTokenizer(br.readLine());
			int gi = Integer.valueOf(st.nextToken());
			while(gi-->0) {
				groupList.get(i).add(Integer.valueOf(st.nextToken())-1);
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int[] cloth = new int[N];
		for(int i=0;i<N;i++) {
			cloth[i] = Integer.valueOf(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0;i<K;i++) {
			int sum=0;
			for(int idx:groupList.get(i)) {
				sum += cloth[idx];
			}
			cnt += (sum+M-1)/M;
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class