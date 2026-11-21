import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> parent, size;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 터널의 개수 n
			int n = Integer.valueOf(br.readLine());
			
			// 초기화
			parent = new ArrayList<>();
			size = new ArrayList<>();
			
			// 터널 추가
			HashMap<String, Integer> building = new HashMap<>();
			int pos=0;
			
			while(n-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name1 = st.nextToken();
				String name2 = st.nextToken();
				
				// 건물 추가
				if(!building.containsKey(name1)) {
					size.add(1);
					parent.add(pos);
					building.put(name1, pos++);
				}
				if(!building.containsKey(name2)) {
					size.add(1);
					parent.add(pos);
					building.put(name2, pos++);
				}
				
				// 다리로 도달할 수 있는 건물의 수 계산
				bw.write(Integer.toString(union(building.get(name1), building.get(name2))));
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(parent.get(x)==x) {
			return x;
		} else {
			parent.set(x, find(parent.get(x)));
			return parent.get(x);
		}
	} // end of find()
	
	static int union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return size.get(x);
		} else if(x<y) {
			parent.set(y, x);
			size.set(x, size.get(x)+size.get(y));
			return size.get(x);
		} else {
			parent.set(x, y);
			size.set(y, size.get(x)+size.get(y));
			return size.get(y);
		}
	} // end of union()
} // end of Main class