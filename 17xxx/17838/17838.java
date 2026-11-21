import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			char[] command = br.readLine().toCharArray();
			
			// 윤표가 좋아하는 커맨드인지 확인
			String isLove = "0\n";

			if(command.length==7&&command[0]==command[1]&&command[0]==command[4]&&command[2]==command[3]&&command[2]==command[5]&&command[2]==command[6]&&command[0]!=command[2]) {
				isLove="1\n";
			}

			bw.write(isLove);
		}

		bw.close();
	} // end of main()
} // end of Main class