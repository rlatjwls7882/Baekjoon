import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 칵테일에 들어있는 재료
		int M = Integer.valueOf(br.readLine());
		HashMap<String, Integer> cocktail = new HashMap<>();
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int amount = Integer.valueOf(st.nextToken());
			cocktail.put(name, cocktail.getOrDefault(name, 0)+amount);
		}
		
		// ai, aj 생성
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for(int i:cocktail.values())
			ai.add(i);
		
		ArrayList<Integer> aj = new ArrayList<Integer>();
		for(int i=0;i<ai.size();i++)
			aj.add((int)(ai.get(i)*1.618));
		
		// 황금 칵테일을 만들었는지 확인
		boolean make=false;
		end: for(int i=0;i<ai.size();i++)
				for(int j=0;j<aj.size();j++)
					if(i!=j&&ai.get(i).equals(aj.get(j))) {
						make=true;
						break end;
					}
		
		bw.write(make?"Delicious!":"Not Delicious...");
		
		bw.close();
	} // end of main
} // end of Main class