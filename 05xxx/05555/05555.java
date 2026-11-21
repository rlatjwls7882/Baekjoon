import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 찾고싶은 문자열 입력
		String string = br.readLine();
		int stringLen = string.length();
		int[] table = makeTable(string);
		
		// 문자열을 포함한 반지의 개수 계산
		int N = Integer.valueOf(br.readLine());
		int cnt=0;
		
		while(N-->0) {
			String ring = br.readLine();
			
			int idx=0;
			for(int i=0;i<20;i++) {
				while(idx>0&&ring.charAt(i%10)!=string.charAt(idx))
					idx=table[idx-1];
				
				if(ring.charAt(i%10)==string.charAt(idx)) {
					if(idx==stringLen-1) {
						cnt++;
						break;
					} else {
						idx++;
					}
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
			while(idx!=0&&pattern.charAt(i)!=pattern.charAt(idx))
				idx=table[idx-1];
			
			if(pattern.charAt(i)==pattern.charAt(idx)) {
				idx++;
				table[i] = idx;
			}
		}
		
		return table;
	} // end of makeTable()
} // end of Main class