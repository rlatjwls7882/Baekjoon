import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		File[] arr = new File[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), ".");
			String name = st.nextToken();
			String extension = st.nextToken();
			arr[i] = new File(name, extension);
		}
		
		HashSet<String> perceive = new HashSet<>();
		while(M-->0) {
			perceive.add(br.readLine());
		}
		
		for(int i=0;i<N;i++) {
			if(perceive.contains(arr[i].extension)) {
				arr[i].cnt++;
			}
		}
		
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			bw.write(arr[i].name+"."+arr[i].extension+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class

class File implements Comparable<File> {
	String name, extension;
	int cnt=0;
	
	public File(String name, String extenstion) {
		this.name=name;
		this.extension=extenstion;
	}
	
	@Override
	public int compareTo(File o) {
		if(!this.name.equals(o.name)) return this.name.compareTo(o.name);
		else if(this.cnt!=o.cnt) return o.cnt-this.cnt;
		return this.extension.compareTo(o.extension);
	}
}