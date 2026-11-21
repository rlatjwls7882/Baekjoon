import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] table;
	
	public static void main(String[] args) throws IOException {
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		// C의 부분 일치 테이블 생성
		makeTable(C);
		
		// A와 B에서 C가 있는지 확인
		if(search(A, C)&&search(B, C)) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
	
	static void makeTable(String string) {
		int length = string.length();
		table = new int[length];
		
		int idx=0;
		for(int i=1;i<length;i++) {
			while(idx!=0&&string.charAt(i)!=string.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(string.charAt(i)==string.charAt(idx)) {
				idx++;
				table[i] = idx;
			}
		}
	} // end of makeTable()
	
	static boolean search(String sentence, String find) {
		int sentenceL = sentence.length();
		int findL = find.length();
		
		int idx=0;
		for(int i=0;i<sentenceL;i++) {
			while(idx!=0&&sentence.charAt(i)!=find.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(sentence.charAt(i)==find.charAt(idx)) {
				if(idx==findL-1) {
					return true;
				} else {
					idx++;
				}
			}
		}
		
		return false;
	} // end of search()
} // end of Main class