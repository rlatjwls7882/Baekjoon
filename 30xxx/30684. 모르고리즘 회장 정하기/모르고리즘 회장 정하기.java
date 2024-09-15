import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 회장으로 뽑힐 사람 확인
		String president="ZZZ";
		
		while(N-->0) {
			String name = br.readLine();
			
			if(name.length()==3&&president.compareTo(name)>0) {
				president=name;
			}
		}
		
		bw.write(president);
		
		bw.close();
	} // end of main()
} // end of Main class