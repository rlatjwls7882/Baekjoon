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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] percent = new double[4];
		for(int i=0;i<4;i++) {
			percent[i] = Double.valueOf(st.nextToken());
		}
		int n = Integer.valueOf(st.nextToken());
		
		double[][] score = new double[4][2];
		while(n-->0) {
			st = new StringTokenizer(br.readLine(), " /");
			String name = st.nextToken();
			st.nextToken();
			if(name.equals("Lab")) {
				score[0][0] += Double.valueOf(st.nextToken());
				score[0][1] += Double.valueOf(st.nextToken());
			} else if(name.equals("Hw")) {
				score[1][0] += Double.valueOf(st.nextToken());
				score[1][1] += Double.valueOf(st.nextToken());
			} else if(name.equals("Proj")) {
				score[2][0] += Double.valueOf(st.nextToken());
				score[2][1] += Double.valueOf(st.nextToken());
			} else {
				score[3][0] += Double.valueOf(st.nextToken());
				score[3][1] += Double.valueOf(st.nextToken());
			}
		}
		
		double totalScore=0;
		for(int i=0;i<4;i++) {
			totalScore += score[i][0]/score[i][1]*percent[i];
		}
		bw.write((int)totalScore+"");
		
		bw.close();
	} // end of main()
} // end of Main class