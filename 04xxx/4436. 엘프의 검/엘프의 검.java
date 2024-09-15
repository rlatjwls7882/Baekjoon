import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			
			// 입력
			String input = br.readLine();
			if(input==null) break;
			long N = Long.valueOf(input);

			// 0~9까지의 숫자가 모두 등장하는 가장 작은 k 계산
			HashSet<Long> nums = new HashSet<Long>();
			for(long i=0;i<=9;i++)
				nums.add(i);
			
			for(long k=1;;k++) {

				long num = N*k;
				while(num!=0) {
					nums.remove(num%10);
					num/=10;
				}

				if(nums.isEmpty()) {
					bw.write(Long.toString(k));
					bw.newLine();
					break;
				}
			}
		}

		bw.close();
	} // end of main()
} // end of Main class