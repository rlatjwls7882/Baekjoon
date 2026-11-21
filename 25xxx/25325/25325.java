import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			map.put(st.nextToken(), 0);
		}
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String name = st.nextToken();
				map.put(name, map.getOrDefault(name, 0)+1);
			}
		}
		
		PriorityQueue<Stu> q = new PriorityQueue<>();
		for(String key:map.keySet()) {
			q.offer(new Stu(key, map.get(key)));
		}
		
		while(N-->0) {
			Stu stu = q.poll();
			bw.write(stu.name+" "+stu.like+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Stu implements Comparable<Stu> {
	String name;
	int like;
	
	public Stu(String name, int like) {
		this.name=name;
		this.like=like;
	}
	
	@Override
	public int compareTo(Stu o) {
		if(o.like!=this.like) {
			return o.like-this.like;
		}
		return this.name.compareTo(o.name);
	}
} // end of Stu class