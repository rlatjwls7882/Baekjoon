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
		int SHU = 0;
		while(N--!=0) {
			String string = bf.readLine();
			if(string.equals("Poblano"))
				SHU+=1500;
			else if(string.equals("Mirasol"))
				SHU+=6000;
			else if(string.equals("Serrano"))
				SHU+=15500;
			else if(string.equals("Cayenne"))
				SHU+=40000;
			else if(string.equals("Thai"))
				SHU+=75000;
			else
				SHU+=125000;
		}
		
		bw.write(SHU+"");
		bw.close();
	} // end of main
} // end of main class