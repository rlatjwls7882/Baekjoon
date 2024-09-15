import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 컴퓨터의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 랜선의 길이 입력
		ArrayList<Node> line = new ArrayList<>();
		int totalLength=0;
		
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<N;j++) {
				int length=0;
				
				if(string.charAt(j)=='0') {
					continue;
				} else if(string.charAt(j)<='Z') {
					length = string.charAt(j)-'A'+27;
				} else {
					length = string.charAt(j)-'a'+1;
				}
				
				totalLength += length;
				line.add(new Node(i, j, length));
			}
		}
		Collections.sort(line);
		
		// 기부할 수 있는 랜선의 길이의 최댓값 계산
		for(int i=0;i<line.size();i++) {
			if(union(line.get(i).start, line.get(i).end)) {
				totalLength -= line.get(i).length;
			}
		}
		
		if(isConnected(N)) {
			bw.write(Integer.toString(totalLength));
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
		return true;
	} // end of union()
	
	static boolean isConnected(int N) {
		for(int i=0;i<N;i++) {
			if(find(i)!=0) {
				return false;
			}
		}
		return true;
	} // end of isConnected()
} // end of Main class

class Node implements Comparable<Node> {
	int start, end, length;
	
	public Node(int start, int end, int length) {
		this.start=start;
		this.end=end;
		this.length=length;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.length-node.length;
	}
} // end of Node class