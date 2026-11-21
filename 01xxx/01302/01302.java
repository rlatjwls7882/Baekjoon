import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 오늘 팔린 N개의 책의 제목
		int N = Integer.valueOf(br.readLine());
		TreeMap<String, Integer> sell = new TreeMap<>();
		while(N-->0) {
			String name = br.readLine();
			sell.put(name, sell.getOrDefault(name, 0)+1);
		}
		
		// 가장 많이 팔린 책 확인
		String name="";
		int cnt=0;
		
		for(String eachName:sell.keySet())
			if(sell.get(eachName)>cnt) {
				cnt=sell.get(eachName);
				name=eachName;
			}
		
		bw.write(name);
		
		bw.close();
	} // end of main
} // end of Main class