import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(bf.readLine());
		
		String[] arr = {" @@@   @@@ ",
						"@   @ @   @",
						"@    @    @",
						"@         @",
						" @       @ ",
						"  @     @  ",
						"   @   @   ",
						"    @ @    ",
						"     @     "};
		
		for(int i=0;i<arr.length;i++) { 
			
			for(int j=0;j<n;j++)
				bw.write(arr[i]+" ");
			
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of main class