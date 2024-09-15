import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bf.readLine();
		String string = bf.readLine();
		int Anum=0, Bnum=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='A')
				Anum++;
			else
				Bnum++;
		}
		
		if(Anum>Bnum) bw.write("A");
		else if(Bnum>Anum) bw.write("B");
		else bw.write("Tie");
		
		bw.close();
	} // end of main
} // end of main class