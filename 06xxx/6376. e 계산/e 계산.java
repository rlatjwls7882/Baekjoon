import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("n e\n");
		bw.write("- -----------\n");
		bw.write("0 1\n");
		bw.write("1 2\n");
		bw.write("2 2.5\n");
		
		// e의 근사값 계산
		double fact=2, e=2.5;
		for(int i=3;i<10;i++) {
			fact*=i;
			e += 1/fact;
			
			bw.write(String.format("%d %.9f\n", i, e));
		}
		
		bw.close();
	} // end of main
} // end of Main class