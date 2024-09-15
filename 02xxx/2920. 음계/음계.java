import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ABC = bf.readLine();
		
		if(ABC.equals("1 2 3 4 5 6 7 8"))
			bw.write("ascending");
		else if(ABC.equals("8 7 6 5 4 3 2 1"))
			bw.write("descending");
		else
			bw.write("mixed");
		
		bw.close();
	} // end of main
} // end of main class