import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// 연두의 이름의 L, O, V, E 계산
		String name = br.readLine();
		int[] nameLOVE = new int[4];
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='L') {
				nameLOVE[0]++;
			} else if(name.charAt(i)=='O') {
				nameLOVE[1]++;
			} else if(name.charAt(i)=='V') {
				nameLOVE[2]++;
			} else if(name.charAt(i)=='E') {
				nameLOVE[3]++;
			}
		}
		
		// 우승할 확률이 가장 높은 팀 계산
		int N = Integer.valueOf(br.readLine());
		String winName="";
		int winScore=-1;
		
		while(N-->0) {

			// 팀이름의 L, O, V, E 계산
			String teamName = br.readLine();
			int[] teamLOVE = new int[4];
			
			for(int i=0;i<teamName.length();i++) {
				if(teamName.charAt(i)=='L') {
					teamLOVE[0]++;
				} else if(teamName.charAt(i)=='O') {
					teamLOVE[1]++;
				} else if(teamName.charAt(i)=='V') {
					teamLOVE[2]++;
				} else if(teamName.charAt(i)=='E') {
					teamLOVE[3]++;
				}
			}
			
			// 확률 계산
			int L = nameLOVE[0]+teamLOVE[0];
			int O = nameLOVE[1]+teamLOVE[1];
			int V = nameLOVE[2]+teamLOVE[2];
			int E = nameLOVE[3]+teamLOVE[3];
			
			int score=(L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)%100;
			
			if(winScore<score) {
				winScore=score;
				winName=teamName;
			} else if(winScore==score&&winName.compareTo(teamName)>0) {
				winName=teamName;
			}
		}
		
		bw.write(winName);
		
		bw.close();
	} // end of main()
} // end of Main class