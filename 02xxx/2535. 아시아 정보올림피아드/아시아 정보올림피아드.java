import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 학생 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 점수대로 정렬
		ArrayList<Stu> list = new ArrayList<>();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int nationNo = Integer.valueOf(st.nextToken());
			int stuNo = Integer.valueOf(st.nextToken());
			int score = Integer.valueOf(st.nextToken());
			list.add(new Stu(nationNo, stuNo, score));
		}
		list.sort(null);
		
		// 금메달, 은메달, 동메달 수상자 계산
		int pos=0;
		for(int i=2;;i++) {
			if(list.get(0).nationNo!=list.get(1).nationNo||list.get(i).nationNo!=list.get(0).nationNo&&list.get(i).nationNo!=list.get(1).nationNo) {
				pos=i;
				break;
			}
		}
		
		bw.write(String.format("%d %d\n", list.get(0).nationNo, list.get(0).stuNo));
		bw.write(String.format("%d %d\n", list.get(1).nationNo, list.get(1).stuNo));
		bw.write(String.format("%d %d", list.get(pos).nationNo, list.get(pos).stuNo));
		
		bw.close();
	} // end of main()
} // end of Main class

class Stu implements Comparable<Stu> {
	int nationNo, stuNo, score;
	
	public Stu(int nationNo, int stuNo, int score) {
		this.nationNo=nationNo;
		this.stuNo=stuNo;
		this.score=score;
	}
	
	@Override
	public int compareTo(Stu stu) {
		return stu.score-this.score;
	}
	
} // end of Stu class