import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 궁합을 볼 이름
		String A = br.readLine();
		String B = br.readLine();
		int[] alphabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		int[] name = new int[A.length()+B.length()];
		for(int i=0;i<A.length();i++) {
			name[i*2] = alphabet[A.charAt(i)-'A'];
			name[i*2+1] = alphabet[B.charAt(i)-'A'];
		}
		
		// A와 B의 이름 궁합 계산
		for(int i=name.length-1;i>1;i--)
			for(int j=0;j<i;j++)
				name[j]=(name[j]+name[j+1])%10;
		
		bw.write(name[0]+""+name[1]);
		
		bw.close();
	} // end of main
} // end of Main class