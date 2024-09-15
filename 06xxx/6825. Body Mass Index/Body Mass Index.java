import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double weight = Double.valueOf(bf.readLine());
		double height = Double.valueOf(bf.readLine());
		double BMI = weight/(height*height);
		
		if(BMI>25)
			bw.write("Overweight");
		else if(BMI>=18.5)
			bw.write("Normal weight");
		else
			bw.write("Underweight");
		
		bw.close();
	} // end of main
} // end of main class