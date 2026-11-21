import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	
	static HashSet<String> canMake = new HashSet<>();
	static int N;
	static int M;
	static boolean[] usedCard;
	static String[] usedList;
	static String[] card;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 카드의 수 N, 뽑을 개수 M
		N = Integer.valueOf(br.readLine());
		M = Integer.valueOf(br.readLine());

        // 사용한 카드를 확인하는 usedCard, 현재 사용중인 카드 목록 usedList
		usedCard = new boolean[N];
		usedList = new String[N];
		
		// 가지고 있는 모든 카드
		card = new String[N];
		for(int i=0;i<N;i++)
			card[i] = br.readLine();
		
		// M장을 선택해 만들 수 있는 정수의 개수 계산
		dfs(0);
		
		bw.write(canMake.size()+"");
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		// 총 M개를 방문한 경우
		if(depth==M) {
			StringBuilder sb = new StringBuilder();
			
			for(String val:usedList)
				sb.append(val);
			
			canMake.add(sb.toString());
			return;
		}
		
		// M개를 방문할 때까지 반복
		for(int nodeNum=0;nodeNum<N;nodeNum++)
			if(!usedCard[nodeNum]) {
				usedList[depth]=card[nodeNum];
				usedCard[nodeNum]=true;
				
				dfs(depth+1);
				usedCard[nodeNum]=false;
			}
	} // end of dfs()
} // end of Main class