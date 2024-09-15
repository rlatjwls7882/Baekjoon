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

		String string = br.readLine();
		
		// 각 모양의 카드수 계산
		HashSet<String> cards = new HashSet<String>();
		int P=13, K=13, H=13, T=13;
		
		for(int i=0;i<string.length();i+=3) {
			if(string.charAt(i)=='P') P--;
			else if(string.charAt(i)=='K') K--;
			else if(string.charAt(i)=='H') H--;
			else T--;
			
			if(!cards.add(string.substring(i,i+3)))
				break;
		}
		
		// 중복된 카드가 존재하는지 확인
		if(cards.size()<string.length()/3) bw.write("GRESKA");
		else bw.write(P+" "+K+" "+H+" "+T);
		
		bw.close();
	} // end of main
} // end of Main class