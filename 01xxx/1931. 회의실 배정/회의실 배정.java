import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 회의의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 회의의 정보
		ArrayList<Meeting> meetings = new ArrayList<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken());
			int end = Integer.valueOf(st.nextToken());
			meetings.add(new Meeting(start, end));
		}
		Collections.sort(meetings);
		
		// 사용할 수 있는 회의의 최대 개수 계산
		int cnt=0, end=0;
		for(int i=0;i<N;i++) {
			Meeting curMeeting = meetings.get(i);
			if(end<=curMeeting.start) {
				end = curMeeting.end;
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class

class Meeting implements Comparable<Meeting> {
	int start, end;
	
	public Meeting(int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public int compareTo(Meeting o) {
		if(this.end!=o.end) {
			return this.end-o.end;
		} else {
			return this.start-o.start;
		}
	}
} // end of Meeting class