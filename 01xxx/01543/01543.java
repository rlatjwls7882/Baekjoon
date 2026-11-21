import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문서와 찾을 단어 입력
		String doc = br.readLine();
		String browse = br.readLine();
		int docLen = doc.length();
		int browseLen = browse.length();
		
		
		// 찾을 단어의 부분 일치 테이블 생성
		int[] table = makeTable(browse);
		
		// 문서에서 단어의 등장 횟수 계산
		int idx=0, cnt=0;
		for(int i=0;i<docLen;i++) {
			while(idx>0&&doc.charAt(i)!=browse.charAt(idx)) {
				idx = table[idx-1];
			}
			if(doc.charAt(i)==browse.charAt(idx)) {
				if(idx==browseLen-1) {
					cnt++;
					idx=0;
				} else {
					idx++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
	
	// 부분 일치 테이블 생성
	static int[] makeTable(String pattern) {
		int length = pattern.length();
		int[] table = new int[length];
		
		int idx=0;
		for(int i=1;i<length;i++) {
			while(idx>0&&pattern.charAt(i)!=pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			if(pattern.charAt(i)==pattern.charAt(idx)) {
				idx++;
				table[i]=idx;
			}
		}
		
		return table;
	} // end of makeTable()
} // end of Main class