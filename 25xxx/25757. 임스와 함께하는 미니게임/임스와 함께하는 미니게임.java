import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 게임을 함께할 친구의 수 N, 게임의 종류 game
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		char game = st.nextToken().charAt(0);
		
		// 게임을 할 수 있는 횟수 계산
		HashSet<String> friends = new HashSet<String>();
		while(N-->0)
			friends.add(br.readLine());
		
		if(game=='Y') {
			bw.write(friends.size()+"");
		} else if(game=='F') {
			bw.write(friends.size()/2+"");
		} else {
			bw.write(friends.size()/3+"");
		}
		
		bw.close();
	} // end of main()
} // end of Main class