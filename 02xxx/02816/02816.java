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
		
		// 채널 목록
		int idxKBS1=0, idxKBS2=0;
		for(int i=1;i<=N;i++) {
			String string = br.readLine();
			if(string.equals("KBS1")) {
				idxKBS1=i;
			} else if(string.equals("KBS2")) {
				idxKBS2=i;
			}
		}
		
		// 눌러야 하는 버튼 순서대로 출력
		if(idxKBS1>idxKBS2) {
			idxKBS2++;
		}
		
		for(int i=0;i<idxKBS1-1;i++) {
			bw.write("1");
		}
		for(int i=0;i<idxKBS1-1;i++) {
			bw.write("4");
		}
		for(int i=0;i<idxKBS2-1;i++) {
			bw.write("1");
		}
		for(int i=0;i<idxKBS2-2;i++) {
			bw.write("4");
		}
		
		bw.close();
	} // end of main()
} // end of Main class