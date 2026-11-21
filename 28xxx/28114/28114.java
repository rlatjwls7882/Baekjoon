import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 멤버 목록 입력
		ArrayList<Member> members = new ArrayList<Member>();
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			String S = st.nextToken();
			members.add(new Member(P, Y, S));
		}
		
		// 첫번째 방법
		PriorityQueue<Member> sort = new PriorityQueue<>(new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.year-m2.year;
			}
		});
		
		sort.addAll(members);
		while(!sort.isEmpty()) {
			bw.write(Integer.toString(sort.poll().year));
		}
		bw.newLine();
		
		// 두번째 방법
		sort = new PriorityQueue<>(new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m2.solve-m1.solve;
			}
		});
		
		sort.addAll(members);
		while(!sort.isEmpty()) {
			bw.write(sort.poll().name.charAt(0));
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Member {
	int solve, year;
	String name;
	
	public Member(int solve, int year, String name) {
		this.solve=solve;
		this.year=year%100;
		this.name=name;
	}
} // end of Member class