import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N개의 단어 입력
		int N = Integer.valueOf(br.readLine());
		HashSet<String> set = new HashSet<String>();
		while(N-->0)
			set.add(br.readLine());
		
		LinkedList<String> list = new LinkedList<String>(set);
		
		// 정렬
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// 길이가 짧은 순
				if(s1.length()!=s2.length())
					return s1.length()-s2.length();
				// 사전 순
				else
					return s1.compareTo(s2);
			}
		});
		
		for(String string:list)
			bw.write(string+"\n");
		
		bw.close();
	} // end of main
} // end of Main class