import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			
			// 9x8 크기의 숫자 입력
			String[] BigNumber = new String[8];
			
			for(int i=0;i<8;i++)
				BigNumber[i] = br.readLine();
			
			// 0
			if(BigNumber[0].equals("..#####.."))
				bw.write("0");
			
			// 1
			else if(BigNumber[0].equals("....##..."))
				bw.write("1");
			
			// 2 3 6 8 9
			else if(BigNumber[0].equals(".#######.")) {
				
				// 2
				if(BigNumber[4].equals("##......."))
					bw.write("2");
				
				// 6
				else if(BigNumber[3].equals("########."))
					bw.write("6");
				
				// 9
				else if(BigNumber[3].equals(".########"))
					bw.write("9");
				
				// 3
				else if(BigNumber[2].equals(".......##"))
					bw.write("3");
				
				// 8
				else
					bw.write("8");
			}
			// 4
			else if(BigNumber[0].equals("##......."))
				bw.write("4");
			
			// 5
			else if(BigNumber[1].equals(".##......"))
				bw.write("5");
			
			// 7
			else
				bw.write("7");
		}
		
		bw.close();
	} // end of main()
} // end of Main class