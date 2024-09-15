import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 정렬
		MentorMentee[] pair = new MentorMentee[N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String mentor = st.nextToken();
			String mentee = st.nextToken();
			pair[i] = new MentorMentee(mentor, mentee);
		}
		Arrays.sort(pair);
		
		// 출력
		for(int i=0;i<N;i++) {
			bw.write(pair[i].mentor+" "+pair[i].mentee+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class MentorMentee implements Comparable<MentorMentee> {
	String mentor, mentee;
	
	public MentorMentee(String mentor, String mentee) {
		this.mentor=mentor;
		this.mentee=mentee;
	}
	
	@Override
	public int compareTo(MentorMentee o) {
		if(!this.mentor.equals(o.mentor)) {
			return this.mentor.compareTo(o.mentor);
		} else {
			return o.mentee.compareTo(this.mentee);
		}
	}
} // end of MentorMentee class