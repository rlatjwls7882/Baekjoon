import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 각각의 숫자가 필요한 개수 계산
		String roomNum = br.readLine();
		int[] requireNums = new int[10];

		for(int i=0;i<roomNum.length();i++) {
			requireNums[roomNum.charAt(i)-'0']++;
		}
		requireNums[6] = (requireNums[6]+requireNums[9]+1)/2;

		// 필요한 숫자 세트의 개수 계산
		int max=0;
		for(int i=0;i<9;i++) {
			if(max<requireNums[i]) {
				max=requireNums[i];
			}
		}

		bw.write(Integer.toString(max));

		bw.close();
	} // end of main()
} // end of Main class