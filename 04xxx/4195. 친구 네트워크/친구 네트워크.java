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
	static HashMap<String, Integer> people;
	static ArrayList<Integer> parent, size;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 친구 관계의 수 F
			int F = Integer.valueOf(br.readLine());
			
			// 초기화
			parent = new ArrayList<>();
			size = new ArrayList<>();
			people = new HashMap<>();
			
			// 친구 관계 입력
			for(int idx=0;F-->0;) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name1 = st.nextToken();
				String name2 = st.nextToken();
				
				// 새로운 이름이 추가되는 경우
				if(!people.containsKey(name1)) {
					parent.add(idx);
					size.add(1);
					people.put(name1, idx++);
				}
				if(!people.containsKey(name2)) {
					parent.add(idx);
					size.add(1);
					people.put(name2, idx++);
				}
				
				// 두 사람의 친구 네트워크에 몇 명이 있는지 확인
				int name1Idx = people.get(name1);
				int name2Idx = people.get(name2);
				
				bw.write(Integer.toString(union(name1Idx, name2Idx)));
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(x==parent.get(x)) {
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