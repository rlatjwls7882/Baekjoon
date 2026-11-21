import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.valueOf(bf.readLine());
		int Y = Integer.valueOf(bf.readLine());
		
		for(int i=0;i<=Y-X;i++)
			if(i%60==0)
				bw.write("All positions change in year "+(i+X)+"\n");
		
		bw.close();
	} // end of main
} // end of main class