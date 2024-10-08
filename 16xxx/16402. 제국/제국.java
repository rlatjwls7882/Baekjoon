import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent = new int[500];
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(br.readLine(), i);
			parent[i]=i;
		}
		
		while(m-->0) {
			st = new StringTokenizer(br.readLine(), ",");
			String a = st.nextToken();
			String b = st.nextToken();
			int c = Integer.valueOf(st.nextToken());
			
			int aNum = find(map.get(a));
			int bNum = find(map.get(b));
			if(aNum==bNum) {
				aNum = map.get(a);
				bNum = map.get(b);
				if(c==1) parent[bNum]=parent[aNum]=aNum;
				else parent[bNum]=parent[aNum]=bNum;					
			} else {
				if(c==1) parent[bNum] = aNum;
				else parent[aNum] = bNum;
			}
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String s:map.keySet()) {
			int idx = map.get(s);
			if(find(idx)==idx) {
				list.add(s);
			}
		}
		Collections.sort(list);
		
		bw.write(list.size()+"\n");
		for(int i=0;i<list.size();i++) {
			bw.write(list.get(i)+"\n");
		}
		
        bw.close();
    } // end of main
	
	static int find(int x) {
		if(parent[x]==x) return x;
		else return parent[x] = find(parent[x]);
	} // end of find
} // end of Main