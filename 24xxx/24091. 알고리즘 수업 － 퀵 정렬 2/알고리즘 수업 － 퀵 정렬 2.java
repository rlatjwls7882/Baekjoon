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
		
		// 배열의 크기 N, 교환 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		// 배열 생성
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// K번째 교환되는 수 확인
		quick_sort(0, N-1);
		if(sb.isEmpty()) {
			bw.write("-1");
		} else {
			bw.write(sb.toString());
		}
		
		bw.close();
	} // end of main()
	
	static void quick_sort(int p, int r) {
		if(p<r) {
			int q = partition(p, r); // A[q] 기준으로 왼쪽에는 작은값, 오른쪽에는 큰값
			quick_sort(p, q-1); // 왼쪽 부분 배열 정렬
			quick_sort(q+1, r); // 오른쪽 부분 배열 정렬
		}
	} // end of quick_sort()
	
	static int partition(int p, int r) {
		int x = A[r]; // 기준원소
		int i = p-1; // i는 x보다 작은 원소들의 끝지점
		for(int j=p;j<r;j++) {
			if(A[j]<=x) {
				swap(++i, j);
				chk();
			}
		}
		if(++i!=r) {
			swap(i, r);
			chk();
		}
		return i;
	} // end of partition()
	
	static void chk() {
		if(--K==0) {
			for(int i=0;i<A.length;i++) {
				sb.append(A[i]).append(' ');
			}
		}
	} // end of chk()
	
	static void swap(int i, int j) {
		int tmp = A[i];
		A[i]=A[j];
		A[j]=tmp;
	} // end of swap()
} // end of Main class