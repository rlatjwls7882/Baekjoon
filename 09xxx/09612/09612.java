import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// n개의 단어 입력
		int n = Integer.valueOf(br.readLine());
		HashMap<String, Integer> word = new HashMap<>();
		
		while(n-->0) {
			String string = br.readLine();
			word.put(string, word.getOrDefault(string, 0)+1);
		}
		
		// 가장 많이 나온 단어 확인
		String maxWord="";
		int max=0;
		
		for(String string:word.keySet()) {
			if(max<word.get(string)) {
				max=word.get(string);
				maxWord=string;
			} else if(max==word.get(string)&&maxWord.compareTo(string)<0)
				maxWord=string;
		}
		
		bw.write(maxWord+" "+max);
		
		bw.close();
	} // end of main
} // end of Main class