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
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		// 가능한 경우 확인
		ArrayList<Pos> pos = new ArrayList<>();
		for(int i=1;i<n;i++) {
			if(a*i+b*(n-i)==w) {
				pos.add(new Pos(i, n-i));
			}
		}
		
		if(pos.size()==1) {
			bw.write(pos.get(0).x+" "+pos.get(0).y);
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Pos {
	int x, y;
	
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos class