import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 광고판의 크기 L, 광고판의 문구 S
		int L = Integer.valueOf(br.readLine());
		String S = br.readLine();
		
		// 부분 일치 테이블 생성
		int[] table = makeTable(S, L);
		
		// 가능한 광고의 길이중 가장 짧은 것의 길이 계산
		bw.write(Integer.toString(L-table[L-1]));
		
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