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

		String[] list = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex", "Total"};
		HashMap<String, Integer> work = new HashMap<>();
		
		// 각각의 일을 한 횟수 계산
		while(true) {
			String string = br.readLine();
			if(string==null) break;
			StringTokenizer st = new StringTokenizer(string);
			
			while(st.hasMoreTokens()) {
				String eachWork = st.nextToken();
				work.put(eachWork, work.getOrDefault(eachWork, 0)+1);
				work.put("Total", work.getOrDefault("Total", 0)+1);
			}
		}
		
		// 각각의 일을 한 횟수와 비율 출력
		for(int i=0;i<8;i++)
			bw.write(String.format("%s %d %.02f\n", list[i], work.getOrDefault(list[i], 0), work.getOrDefault(list[i], 0)/(double)work.get("Total")));

		bw.close();
	} // end of main()
} // end of Main class