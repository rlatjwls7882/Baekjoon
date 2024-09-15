import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			
			String message = br.readLine();
			if(message.equals("END")) break;
			
			// 메세지를 만들 수 있는지 확인
			HashSet<Character> alphabet = new HashSet<>();
			boolean canMake=true;
			
			for(int i=0;i<message.length();i++)
				if(message.charAt(i)!=' ')
					if(!alphabet.add(message.charAt(i))) {
						canMake=false;
						break;
					}
			
			if(canMake)
				bw.write(message+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class