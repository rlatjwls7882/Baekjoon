import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final double Gallon = 3.785411784; // 1갤런 =  3.785411784리터
		final double Mile = 1609.344;// 1마일 = 1609.344미터
		
		double input = Double.valueOf(bf.readLine());
		
		double output = 100*1000/Mile/input*Gallon; //100km / Mile / input * Gallon
		
		bw.write(output+"");
		bw.close();
	} // end of main
} // end of main class