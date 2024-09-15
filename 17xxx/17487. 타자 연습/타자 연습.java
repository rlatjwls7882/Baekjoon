import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		String leftChars = "QAZWSXEDCRFVTGBY";
		String rightChars = "UHNIJMOKPL";
		
		// 왼손과 오른손으로만 쳐야하는 자판과 양손으로 칠수 있는 자판의 수 계산
		int left=0, right=0, wild=0;
		
		for(int i=0;i<string.length();i++) {
			
			if(string.charAt(i)==' ') {
				wild++;
				continue;
			}
			
			boolean Continue = false;
			if(string.charAt(i)<='Z') {
				wild++;
			}
			
			for(int j=0;j<leftChars.length();j++) {
				if(string.charAt(i)==leftChars.charAt(j)||string.charAt(i)-32==leftChars.charAt(j)) {
					left++;
					Continue=true;
					break;
				}
			}
			
			if(Continue) {
				continue;
			}
			
			for(int j=0;j<rightChars.length();j++) {
				if(string.charAt(i)==rightChars.charAt(j)||string.charAt(i)-32==rightChars.charAt(j)) {
					right++;
					break;
				}
			}
		}
		
		// 왼손과 오른손의 차이를 최소로 줄이기
		if(left>right) {
			int diff = left-right;
			right += Math.min(wild, diff);
			wild -= Math.min(wild, diff);
		} else {
			int diff = right-left;
			left += Math.min(wild, diff);
			wild -= Math.min(wild, diff);
		}
		
		// 남은 양손을 사용할 수 있는 기회 분배
		right += wild/2;
		left += wild - wild/2;
		
		bw.write(Integer.toString(left));
		bw.write(' ');
		bw.write(Integer.toString(right));

		bw.close();
	} // end of main()
} // end of Main class