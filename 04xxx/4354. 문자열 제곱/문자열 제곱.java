import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			
			// 문자열 S 입력
			String S = br.readLine();
			int length = S.length();
			
			if(S.equals(".")) {
				break;
			}
			
			// 부분 일치 테이블 생성
			int[] table = makeTable(S, length);
			
			// a^n에서 n의 최댓값(반복되는 단어의 수) 계산
			if(length%(length-table[length-1])==0) {
				bw.write(Integer.toString(length/(length-table[length-1])));
				bw.newLine();
			} else {
				bw.write("1\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static int[] makeTable(String S, int length) {
		int[] table = new int[length];
		
		int idx=0;
		for(int i=1;i<length;i++) {
			while(idx!=0&&S.charAt(i)!=S.charAt(idx)) {
				idx = table[idx-1];
			}
			if(S.charAt(i)==S.charAt(idx)) {
				idx++;
				table[i]=idx;
			}
		}
		return table;
	} // end of makeTable()
} // end of Main class