import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 몇 단계만에 6174가 되는지 확인
		while(N-->0) {
			String string = br.readLine();
			int[] num = new int[4];
			for(int i=0;i<4;i++) {
				num[i] = string.charAt(i)-'0';
			}
			
			int cnt=0;
			while(!(num[0]==6&&num[1]==1&&num[2]==7&&num[3]==4)) {
				cnt++;
				num = getNext(num);
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static int[] getNext(int[] num) {
		Arrays.sort(num);
		
		int max=0, min=0;
		for(int i=3;i>=0;i--) {
			min += num[i]*Math.pow(10, 3-i);
			max += num[i]*Math.pow(10, i);
		}
		max -= min;
		
		return new int[]{max/1000, max/100%10, max/10%10, max%10};
	} // end of getNext()
} // end of Main class