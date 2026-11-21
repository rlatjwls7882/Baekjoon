import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] A;
	static int K;
	
	public static void main(String[] args) throws IOException {
		
		// 배열의 크기 N, 찾을 원소 정보 Q, 교환 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		// 배열 A
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 배열 A에서 Q번째 작은 원소 찾기
		select(0, N-1, Q);
		if(sb.isEmpty()) {
			bw.write("-1");
		} else {
			bw.write(sb.toString());
		}
		
		bw.close();
	} // end of main()
	
	static int select(int p, int r, int q) { // A[p..r]에서 q번째 작은 원소를 찾는다.
		if(p==r) {
			return A[p];
		}
		int t = partition(p, r); // 분할
		int k = t-p+1; // 기준원소가 전체에서 k번째 작은 원소임
		
		if(q<k) {
			return select(p, t-1, q);
		} else if(q==k) {
			return A[t];
		} else {
			return select(t+1, r, q-k);
		}
	} // end of select()
	
	static int partition(int p, int r) {
		int x = A[r]; // 기준원소
		int i = p-1; // i는 x보다 작은 원소들의 끝 지점
		
		for(int j=p;j<r;j++) {
			if(A[j]<=x) {
				swap(++i, j);
				check(i, j);
			}
		}
		
		if(++i!=r) {
			swap(i, r);
			check(i, r);
		}
		
		return i;
	} // end of partition()
	
	static void check(int i, int j) {
		if(--K==0) {
			if(A[i]<A[j]) {
				sb.append(A[i]).append(' ').append(A[j]);
			} else {
				sb.append(A[j]).append(' ').append(A[i]);
			}
		}
	} // end of check()
	
	static void swap(int i, int j) {
		int tmp=A[i];
		A[i]=A[j];
		A[j]=tmp;
	} // end of swap()
} // end of Main class