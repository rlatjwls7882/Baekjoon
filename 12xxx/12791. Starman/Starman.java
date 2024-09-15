import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 전처리
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1967, "DavidBowie");
		map.put(1969, "SpaceOddity");
		map.put(1970, "TheManWhoSoldTheWorld");
		map.put(1971, "HunkyDory");
		map.put(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
		map.put(1973, "AladdinSane\n1973 PinUps");
		map.put(1974, "DiamondDogs");
		map.put(1975, "YoungAmericans");
		map.put(1976, "StationToStation");
		map.put(1977, "Low\n1977 Heroes");
		map.put(1979, "Lodger");
		map.put(1980, "ScaryMonstersAndSuperCreeps");
		map.put(1983, "LetsDance");
		map.put(1984, "Tonight");
		map.put(1987, "NeverLetMeDown");
		map.put(1993, "BlackTieWhiteNoise");
		map.put(1995, "1.Outside");
		map.put(1997, "Earthling");
		map.put(1999, "Hours");
		map.put(2002, "Heathen");
		map.put(2003, "Reality");
		map.put(2013, "TheNextDay");
		map.put(2016, "BlackStar");
		
		// 두 날짜 사이에 발매한 앨범의 수 계산
		int Q = Integer.valueOf(br.readLine());
		
		while(Q-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int E = Integer.valueOf(st.nextToken());
			
			int cnt=0;
			StringBuilder sb = new StringBuilder();
			for(int i=S;i<=E;i++) {
				if(map.containsKey(i)) {
					sb.append(i).append(' ').append(map.get(i)).append('\n');
					cnt++;
					if(i==1973||i==1977) {
						cnt++;
					}
				}
			}
			
			// 출력
			bw.write(Integer.toString(cnt));
			bw.newLine();
			bw.write(sb.toString());
		}
		
		bw.close();
	} // end of main()
} // end of Main class