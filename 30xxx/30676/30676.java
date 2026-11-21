import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int lambda = Integer.valueOf(br.readLine());
		
		// 해당 파장이 어떤 색인지 확인
		if(lambda>=620) {
			bw.write("Red");
		} else if(lambda>=590) {
			bw.write("Orange");
		} else if(lambda>=570) {
			bw.write("Yellow");
		} else if(lambda>=495) {
			bw.write("Green");
		} else if(lambda>=450) {
			bw.write("Blue");
		} else if(lambda>=425) {
			bw.write("Indigo");
		} else {
			bw.write("Violet");
		}

		bw.close();
	} // end of main()
} // end of main class