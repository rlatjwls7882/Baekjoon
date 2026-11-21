import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = bf.readLine();
		int num = Integer.valueOf(string);
		int a=0, b=0;
		
		if(num%10==0) { // B 두자리수
			a=num/100;
			b=num%100;
		}
		
		else { // A 두자리수
			a=num/10;
			b=num%10;
		}

		
		bw.write(a+b+"");
		bw.close();
	} // end of main
} // end of main class