import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		// 카드 확인
		int[] cards = new int[15];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(n-->0) {
			String string = st.nextToken();
			cards[(string.charAt(0)-'1')+(string.charAt(1)-'A')*5]++;
		}
		
		// 올바른 카드 세트를 생성할 수 있는지 확인
		boolean chk=true;
		for(int i=0;i<15;i++) {
			if(i%5==4) {
				if(cards[i]<2) {
					chk=false;
					break;
				}
			} else {
				if(cards[i]<1) {
					chk=false;
					break;
				}
			}
		}
		
		if(chk) {
			bw.write("TAK");
		} else {
			bw.write("NIE");
		}
		
		bw.close();
	} // end of main()
} // end of Main class