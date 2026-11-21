import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int nA = Integer.valueOf(st.nextToken());
		int nB = Integer.valueOf(st.nextToken());
		
		// 집합 A 생성
		TreeSet<Integer> A = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		while(nA-->0)
			A.add(Integer.valueOf(st.nextToken()));
		
		// 집합 A에 속한 원소 삭제
		st = new StringTokenizer(br.readLine());
		while(nB-->0)
			A.remove(Integer.valueOf(st.nextToken()));
		
		// A에 남은 원소들
		bw.write(A.size()+"\n");
		
		Iterator<Integer> it = A.iterator();
		while(it.hasNext())
			bw.write(it.next()+" ");
		
		bw.close();
	} // end of main
} // end of Main class