import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = bf.readLine().trim();
		
		if(string.equals("fdsajkl;")||string.equals("jkl;fdsa"))
			bw.write("in-out");
		
		else if(string.equals("asdf;lkj")||string.equals(";lkjasdf"))
			bw.write("out-in");
		
		else if(string.equals("asdfjkl;"))
			bw.write("stairs");
		
		else if(string.equals(";lkjfdsa"))
			bw.write("reverse");
		
		else
			bw.write("molu");
		
		bw.close();
	} // end of main
} // end of main class