import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			String string = bf.readLine();
			int num=0;
			
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='D')
					break;
				num++;
			}
			bw.write(num+"\n");
		}
		bw.close();
	} // end of main
} // end of main class