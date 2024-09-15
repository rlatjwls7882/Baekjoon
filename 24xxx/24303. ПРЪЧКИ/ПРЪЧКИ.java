import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 각 막대의 길이와 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.valueOf(st.nextToken());
		int a2 = Integer.valueOf(st.nextToken());
		int a3 = Integer.valueOf(st.nextToken());
		int b1 = Integer.valueOf(st.nextToken());
		int b2 = Integer.valueOf(st.nextToken());
		int b3 = Integer.valueOf(st.nextToken());
		
		// 정렬
		Stick[] sticks = new Stick[3];
		sticks[0] = new Stick(a1, b1);
		sticks[1] = new Stick(a2, b2);
		sticks[2] = new Stick(a3, b3);
		Arrays.sort(sticks);
		
		// 가장 적은 막대를 사용하여 L 만들기
		int L = Integer.valueOf(st.nextToken());
		int cnt=0, pos=0;
		
		while(L>0) {
			if(pos==3) {
				break;
			} else if(sticks[pos].b==0) {
				pos++;
			} else {
				L -= sticks[pos].a;
                sticks[pos].b--;
				cnt++;
			}
		}
		
		// 출력
		if(pos==3) {
			bw.write("0");
		} else {
			bw.write(Integer.toString(cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Stick implements Comparable<Stick> {
	int a, b;
	public Stick(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public int compareTo(Stick o) {
		return o.a-this.a;
	}
} // end of Stick class