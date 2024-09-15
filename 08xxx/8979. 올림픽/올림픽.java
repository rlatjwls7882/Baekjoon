import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 국가의 수 N, 등수를 알고 싶은 국가 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 국가 리스트 생성
		Nation[] list = new Nation[N];
		for(int i=0;i<N;i++) {
			list[i] = new Nation(br.readLine());
		}
		
		// K번 국가의 등수 계산
		int rank=1;
		for(int i=0;i<N;i++) {
			if(list[i].num==K) {
				for(int j=0;j<N;j++) {
					if(list[i].gold<list[j].gold
						||list[i].gold==list[j].gold&&list[i].silver<list[j].silver
						||list[i].gold==list[j].gold&&list[i].silver==list[j].silver&&list[i].copper<list[j].copper) {
						rank++;
					}
				}
			}
		}
		
		bw.write(Integer.toString(rank));

		bw.close();
	} // end of main()
} // end of Main class

class Nation {
	int num;
	int gold;
	int silver;
	int copper;
	
	public Nation(String string) {
		StringTokenizer st = new StringTokenizer(string);
		this.num = Integer.valueOf(st.nextToken());
		this.gold = Integer.valueOf(st.nextToken());
		this.silver = Integer.valueOf(st.nextToken());
		this.copper = Integer.valueOf(st.nextToken());
	}
} // end of Nation class