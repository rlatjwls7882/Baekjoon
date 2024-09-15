import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double input;
		
		while((input=Double.valueOf(bf.readLine()))!=0)
			System.out.printf("%.2f%n",1+input+input*input+input*input*input+input*input*input*input);
		
	} // end of main
} // end of main class