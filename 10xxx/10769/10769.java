import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String string = br.readLine();
		
		// 행복한지, 슬픈지 확인
		int happy=0, sad=0;
		for(int i=0;i<string.length()-2;i++)
			if(string.charAt(i)==':')
				if(string.charAt(i+1)=='-') {
					if(string.charAt(i+2)==')') {
						happy++;
						i+=2;
					} else if(string.charAt(i+2)=='(') {
						sad++;
						i+=2;
					} else {
						i++;
					}
				}
		
		if(happy==0&&sad==0) bw.write("none");
		else if(happy>sad) bw.write("happy");
		else if(happy<sad) bw.write("sad");
		else bw.write("unsure");
		
		bw.close();
	} // end of main
} // end of Main class