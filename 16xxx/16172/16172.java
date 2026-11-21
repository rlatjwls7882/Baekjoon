import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String S = br.readLine();
		String K = br.readLine();
		
		// K의 부분 일치 테이블 생성
		int[] table = makeTable(K);
		
		// S에 K가 존재하는지 확인
		String isExist="0";
		int idx=0;
		for(int i=0;i<S.length();i++) {
			if('0'<=S.charAt(i)&&S.charAt(i)<='9') {
				continue;
			}
			
			while(idx!=0&&S.charAt(i)!=K.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(S.charAt(i)==K.charAt(idx)) {
				idx++;
				if(idx==K.length()) {
					isExist="1";
					break;
				}
			}
		}
		
		bw.write(isExist);
		
		bw.close();
	} // end of main()
	
	static int[] makeTable(String string) {
		int length = string.length();
		int[] table = new int[length];
		
		int idx=0;
		for(int i=1;i<length;i++) {
			while(idx!=0&&string.charAt(i)!=string.charAt(idx)) {
				idx = table[idx-1];
			}
			if(string.charAt(i)==string.charAt(idx)) {
				idx++;
				table[i]=idx;
			}
		}
		
		return table;
	} // end of makeTable()
} // end of Main class