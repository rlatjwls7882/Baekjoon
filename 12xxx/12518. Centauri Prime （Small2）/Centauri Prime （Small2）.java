import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String country = br.readLine();
			char end = country.charAt(country.length()-1);
			if(end<='Z') {
				end += 32;
			}
			
			String ruler="";
			if(end=='y') {
				ruler = "nobody";
			} else if(end=='a'||end=='e'||end=='i'||end=='o'||end=='u') {
				ruler = "a queen";
			} else {
				ruler = "a king";
			}
			
			bw.write(String.format("Case #%d: %s is ruled by %s.\n", i, country, ruler));
		}
		
		bw.close();
	} // end of main()
} // end of Main class