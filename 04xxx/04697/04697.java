import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int width = Integer.valueOf(st.nextToken());
			int length = Integer.valueOf(st.nextToken());
			int height = Integer.valueOf(st.nextToken());
			int area = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			if(n==0) {
				break;
			}
			
			int paintingArea = width*length+(width+length)*height*2;
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				paintingArea -= Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
			}
			paintingArea *= n;
			
			bw.write((paintingArea+area-1)/area+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class