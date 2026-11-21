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
		
		while(n--!=0) {
			String string = bf.readLine();
			
			bw.write(string+"\n");
			if(string.indexOf("17")!=-1&&string.indexOf("18")!=-1)
				bw.write("both\n\n");
			else if(string.indexOf("18")!=-1)
				bw.write("mack\n\n");
			else if(string.indexOf("17")!=-1)
				bw.write("zack\n\n");
			else
				bw.write("none\n\n");
		}
		bw.close();
	} // end of main
} // end of main class