import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		double input;
		
		while((input=Double.valueOf(bf.readLine()))!=-1)
			System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n",input,input*0.167);
		
	} // end of main
} // end of main class