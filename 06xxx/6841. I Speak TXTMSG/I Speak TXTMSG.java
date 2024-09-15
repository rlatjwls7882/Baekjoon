import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String string = bf.readLine();
			
			if(string.equals("CU"))
				bw.write("see you\n");
			else if(string.equals(":-)"))
				bw.write("I’m happy\n");
			else if(string.equals(":-("))
				bw.write("I’m unhappy\n");
			else if(string.equals(";-)"))
				bw.write("wink\n");
			else if(string.equals(":-P"))
				bw.write("stick out my tongue\n");
			else if(string.equals("(~.~)"))
				bw.write("sleepy\n");
			else if(string.equals("TA"))
				bw.write("totally awesome\n");
			else if(string.equals("CCC"))
				bw.write("Canadian Computing Competition\n");
			else if(string.equals("CUZ"))
				bw.write("because\n");
			else if(string.equals("TY"))
				bw.write("thank-you\n");
			else if(string.equals("YW"))
				bw.write("you’re welcome\n");
			else if(string.equals("TTYL")) {
				bw.write("talk to you later\n");
				break;
			}
			else
				bw.write(string+"\n");
		} // end of while
		
		bw.close();
	} // end of main
} // end of main class