import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine().toLowerCase();
		
		int[] score = new int[2];
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='n'||string.charAt(i)=='g') {
				score[0]++;
			} else if(string.charAt(i)=='w'||string.charAt(i)=='b'||string.charAt(i)=='d') {
				score[1]++;
			} else if(string.charAt(i)=='a'||string.charAt(i)=='o') {
				score[0]+=2;
			} else if(string.charAt(i)=='i') {
				score[1]+=3;
			}
		}
		
		if(score[0]==score[1]) {
			bw.write("Feud continues");
		} else if(score[0]>score[1]) {
			bw.write("Kangaroos");
		} else {
			bw.write("Kiwis");
		}
		
		bw.close();
	} // end of main()
} // end of Main class