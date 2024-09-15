import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 참가하는 학생수 N, 한 방의 정원 수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		double K = Double.valueOf(st.nextToken());
		
		// 각 그룹별 학생 수 계산
		int[][] stu = new int[2][3];
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.valueOf(st.nextToken());
			int grade = Integer.valueOf(st.nextToken());
			
			if(grade<=2) stu[0][0]++;
			else if(grade<=4&&gender==0) stu[0][1]++;
			else if(grade<=4) stu[1][1]++;
			else if(gender==0) stu[0][2]++;
			else stu[1][2]++;
		}
		
		// 필요한 방의 수 계산
		int room=0;
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				room += Math.ceil(stu[i][j]/K);
		
		bw.write(room+"");
		
		bw.close();
	} // end of main
} // end of Main class