import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		PriorityQueue<Classes> classes = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int T = Integer.valueOf(st.nextToken());
			classes.add(new Classes(S, +1));
			classes.add(new Classes(T, -1));
		}
		
		int maxClassCnt=0, curClassCnt=0;
		for(int i=0;i<N*2;i++) {
			Classes curClasses = classes.poll();
			if(curClasses.startOrEnd==1) {
				curClassCnt++;
			} else {
				curClassCnt--;
			}
			maxClassCnt = Math.max(curClassCnt, maxClassCnt);
		}
		bw.write(Integer.toString(maxClassCnt));
		
		bw.close();
	} // end of main()
} // end of Main class

class Classes implements Comparable<Classes> {
	int time, startOrEnd;
	
	public Classes(int time, int startOrEnd) {
		this.time=time;
		this.startOrEnd=startOrEnd;
	}
	
	@Override
	public int compareTo(Classes o) {
		if(this.time!=o.time) {
			return this.time-o.time;
		} else {
			return this.startOrEnd-o.startOrEnd;
		}
	}
} // end of Classes class