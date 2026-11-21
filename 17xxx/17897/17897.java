import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		boolean chk=true;
		while(N-->0) {
			int K = Integer.valueOf(br.readLine());
			String name = br.readLine();
			
			boolean pea_soup=false, pancakes=false;
			while(K-->0) {
				String string = br.readLine();
				if(string.equals("pea soup")) {
					pea_soup=true;
				} else if(string.equals("pancakes")) {
					pancakes=true;
				}
			}
			
			if(pea_soup&&pancakes) {
				bw.write(name);
				chk=false;
				break;
			}
		}
		if(chk) {
			bw.write("Anywhere is fine I guess");
		}
		
		bw.close();
	} // end of main()
} // end of Main class