import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N;
	static long[] price;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.valueOf(br.readLine())-1;
		
		// 도로와 주유소의 기름의 가격 입력
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		long[] road = new long[N];
		price = new long[N];
		
		for(int i=0;i<N;i++) {
			road[i] = Long.valueOf(st1.nextToken());
			price[i] = Long.valueOf(st2.nextToken());
		}
		
		// 제일 오른쪽 도시로 가는 최소 비용 계산
		long cost=0;
		for(int i=0;i<N;) {
			int pos = getPos(i);
			
			for(int j=i;j<=pos;j++) {
				cost += price[i]*road[j];
			}
			i=pos+1;
		}
		
		bw.write(Long.toString(cost));
		
		bw.close();
	} // end of main()
	
	static int getPos(int pos) {
		long val = price[pos];
		
		while(pos<N) {
			if(val>price[pos]) {
				return pos-1;
			}
			pos++;
		}

		return N-1;
	} // end of getPos()
} // end of Main class