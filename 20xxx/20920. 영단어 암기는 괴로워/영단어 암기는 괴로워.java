import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// N개의 단어 입력
		HashMap<String, Integer> map = new HashMap<>();
		while(N-->0) {
			String string = br.readLine();
			if(string.length()>=M)
				map.put(string, map.getOrDefault(string, 0)+1);
		}
		
		// 정렬
		ArrayList<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// 1. 단어가 나오는 빈도
				if(map.get(s1)!=map.get(s2))
					return map.get(s2)-map.get(s1);
				// 2. 단어의 길이
				else if(s1.length()!=s2.length())
					return s2.length()-s1.length();
				// 3. 알파벳 사전 순서
				else return s1.compareTo(s2);
			}
		});
		
		for(String string:list)
			bw.write(string+"\n");
		
		bw.close();
	} // end of main
} // end of Main class