import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 팀의 수 n, 문제의 수 m, 채점 로그의 수 q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int q = Integer.valueOf(st.nextToken());
		
		// 팀 생성
		ArrayList<Team> teams = new ArrayList<>();
		for(int i=0;i<n;i++) {
			teams.add(new Team(i+1, m));
		}
		
		// 채점 로그 확인
		while(q-->0) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.valueOf(st.nextToken());
			int teamNum = Integer.valueOf(st.nextToken())-1;
			int problemNum = Integer.valueOf(st.nextToken())-1;
			String result = st.nextToken();
			
			Team curTeam = teams.get(teamNum);
			if(result.contentEquals("AC")) {
				if(curTeam.penalty[problemNum]!=-1) {
					curTeam.solved++;
					curTeam.time += time + curTeam.penalty[problemNum]*20;
					curTeam.penalty[problemNum]=-1;
				}
			} else {
				if(curTeam.penalty[problemNum]!=-1) {
					curTeam.penalty[problemNum]++;
				}
			}
		}
		
		// 각 팀의 결과 확인
		Collections.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team o1, Team o2) {
				if(o1.solved!=o2.solved) {
					return o2.solved-o1.solved;
				} else if(o1.time!=o2.time) {
					return o1.time-o2.time;
				} else {
					return o1.teamNum-o2.teamNum;
				}
			}
		});
		
		for(int i=0;i<n;i++) {
			bw.write(teams.get(i).teamNum+" "+teams.get(i).solved+" "+teams.get(i).time+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Team {
	int teamNum, solved=0, time=0;
	int[] penalty;
	
	public Team(int teamNum, int m) {
		this.teamNum=teamNum;
		penalty = new int[m];
	}
} // end of Team class