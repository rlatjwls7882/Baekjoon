import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 메뉴의 수 n
		int n = Integer.valueOf(br.readLine());
		
		// 주문할 메뉴의 위치 계산
		while(n-->0) {
			String m = Long.toBinaryString(Long.valueOf(br.readLine()));
			if(m.indexOf('1')!=m.lastIndexOf('1')) {
				bw.write(Integer.toString(m.length()-1-m.lastIndexOf('1')));
				bw.write(' ');
				bw.write(Integer.toString(m.length()-1-m.indexOf('1')));
			} else {
				bw.write(Integer.toString(m.length()-2-m.lastIndexOf('1')));
				bw.write(' ');
				bw.write(Integer.toString(m.length()-2-m.lastIndexOf('1')));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class