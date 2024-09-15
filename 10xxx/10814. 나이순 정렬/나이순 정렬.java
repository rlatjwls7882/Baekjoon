import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N명의 회원 입력
		int N = Integer.valueOf(br.readLine());
		Member[] members = new Member[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			members[i] = new Member(Integer.valueOf(st.nextToken()), st.nextToken());
		}
		
		// 정렬
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.age-m2.age;
			}
		});
		
		for(Member a:members)
			bw.write(a.age+" "+a.name+"\n");
		
		bw.close();
	} // end of main
} // end of Main class

class Member {
	int age;
	String name;

	public Member(int age, String name) {
		this.age=age;
		this.name=name;
	}
} // end of Member class