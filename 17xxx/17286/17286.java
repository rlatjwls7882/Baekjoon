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
		
		// 유미와 세 사람의 위치
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] yumiPos = new int[2];
		yumiPos[0] = Integer.valueOf(st.nextToken());
		yumiPos[1] = Integer.valueOf(st.nextToken());
		
		int[][] person = new int[3][2];
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			person[i][0] = Integer.valueOf(st.nextToken());
			person[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 유미의 최단거리 계산
		double dist=100;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(i!=j&&i!=k&&j!=k) {
						dist = Math.min(dist, calcDist(yumiPos, person[i])+calcDist(person[i], person[j])+calcDist(person[j], person[k]));
					}
				}
			}
		}
		bw.write(Integer.toString((int)dist));
		
		bw.close();
	} // end of main()
	
	static double calcDist(int[] a, int[] b) {
		return Math.sqrt(Math.pow(a[0]-b[0], 2)+Math.pow(a[1]-b[1], 2));
	} // end of calcDist()
} // end of Main class