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
		
		// 점수 계산
		int curScore=0, maxScore=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='[') curScore+=3;
			else if(string.charAt(i)=='{') curScore+=2;
			else if(string.charAt(i)=='(') curScore+=1;
			else if(string.charAt(i)==']') curScore-=3;
			else if(string.charAt(i)=='}') curScore-=2;
			else if(string.charAt(i)==')') curScore-=1;
			else if(curScore>maxScore) maxScore=curScore;
		}
		
		bw.write(maxScore+"");
		
		bw.close();
	} // end of main
} // end of Main class