import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean end=false;
	static int[] A, tmp;
	static int K, res;
	
	public static void main(String[] args) throws IOException {
		
		// 배열의 크기 N, 저장 횟수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		// 배열 입력
		st = new StringTokenizer(br.readLine());
		A = new int[N];
		tmp = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 병합정렬 수행
		merge_sort(0, N-1);
		
		// 배열 A에 K번째 저장되는 수 출력
		if(end) {
			bw.write(Integer.toString(res));
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
	
	static void merge_sort(int start, int end) {
		if(K<=0) {
			return;
		}
		
		if(start<end) {
			int mid = (start+end)/2;
			merge_sort(start, mid);
			merge_sort(mid+1, end);
			merge(start, mid, end);
		}
	} // end of merge_sort()
	
	static void merge(int start, int mid, int end) {
		if(K<=0) {
			return;
		}
		
		// 투 포인터로 정렬
		int left=start, right=mid+1, pos=start;
		
		while(left<=mid&&right<=end) {
			if(A[left]<=A[right]) {
				tmp[pos++]=A[left++];
				if(isEnd(pos-1)) {
					return;
				}
			} else {
				tmp[pos++]=A[right++];
				if(isEnd(pos-1)) {
					return;
				}
			}
		}

		// 남은 원소 꺼내기
		while(left<=mid) {
			tmp[pos++]=A[left++];
			if(isEnd(pos-1)) {
				return;
			}
		}
		while(right<=end) {
			tmp[pos++]=A[right++];
			if(isEnd(pos-1)) {
				return;
			}
		}

		// 정렬한 값으로 원래 값 대체
		while(start<=end) {
			A[start]=tmp[start];
			start++;
		}
		
	} // end of merge()
	
	static boolean isEnd(int pos) {
		if(--K==0) {
			end=true;
			res=tmp[pos];
			return true;
		}
		
		return false;
	} // end of isEnd()
} // end of Main class