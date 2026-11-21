import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		LinkedList<Queue<String>> queues = new LinkedList<>(); 
		for(int i=0;i<N;i++) {
			queues.add(new LinkedList<String>());
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				queues.getLast().add(st.nextToken());
			}
		}
		
		int idx=0;
		String[] strings = br.readLine().split(" ");
		while(true) {
			boolean change = false;
			for(int i=0;i<N;i++) {
				while(idx<strings.length && !queues.get(i).isEmpty() && strings[idx].equals(queues.get(i).peek())) {
					idx++;
					change=true;
					queues.get(i).poll();
				}
			}
			if(!change) break;
		}
		
		if(idx==strings.length) {
			boolean chk = true;
			for(int i=0;i<N;i++) {
				if(!queues.get(i).isEmpty()) {
					chk=false;
				}
			}
			if(chk) bw.write("Possible");
			else bw.write("Impossible");
		} else {
			bw.write("Impossible");
		}
        bw.close();
    } // end of main
} // end of Main