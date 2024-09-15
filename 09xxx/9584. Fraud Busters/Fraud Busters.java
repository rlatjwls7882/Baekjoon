import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 스캐너가 인식한 코드와 데이터베이스의 차량의 숫자
		String code = br.readLine();
		int n = Integer.valueOf(br.readLine());
		
		// 스캐너가 인식한 코드와 일치하는 차량 확인
		ArrayList<String> codes = new ArrayList<>();
		while(n-->0) {
			String string = br.readLine();
			if(isEqual(code, string)) {
				codes.add(string);
			}
		}
		
		bw.write(Integer.toString(codes.size()));
		for(int i=0;i<codes.size();i++) {
			bw.write("\n"+codes.get(i));
		}
		
		bw.close();
	} // end of main()
	
	static boolean isEqual(String s1, String s2) {
		for(int i=0;i<9;i++) {
			if(s1.charAt(i)!='*'&&s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	} // end of isEqual()
} // end of Main class