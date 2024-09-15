import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		int c = Integer.valueOf(br.readLine());
		int d = Integer.valueOf(br.readLine());
		int s = Integer.valueOf(br.readLine());
		
		int A = s/(a+b)*(a-b);
		if(s%(a+b)>a) {
			A += a;
			A -= s%(a+b)-a;
		} else {
			A += s%(a+b);
		}
		
		int B = s/(c+d)*(c-d);
		if(s%(c+d)>c) {
			B += c;
			B -= s%(c+d)-c;
		} else {
			B += s%(c+d);
		}
		
		if(A>B) {
			bw.write("Nikky");
		} else if(A<B) {
			bw.write("Byron");
		} else {
			bw.write("Tied");
		}
		
		bw.close();
	} // end of main()
} // end of Main class