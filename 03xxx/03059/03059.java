import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			String string = bf.readLine();
			int sum=0;
			
			for(int i=0;i<26;i++)
				if(string.indexOf(i+65)==-1)
					sum+=i+65;
			
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class