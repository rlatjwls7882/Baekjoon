import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 점수 입력
		TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		for(int i=1;i<=8;i++)
			map.put(Integer.valueOf(br.readLine()), i);
		
		// 총점과 위치 계산
		int sum=0;
		TreeSet<Integer> pos = new TreeSet<>();
		
		Iterator<Integer> it = map.keySet().iterator();
		for(int i=0;i<5;i++) {
			int score = it.next();
			sum += score;
			pos.add(map.get(score));
		}
		
		bw.write(sum+"\n");
		for(int i=0;i<5;i++) {
			if(i!=0) bw.write(" ");
			bw.write(pos.pollFirst()+"");
		}
		
		bw.close();
	} // end of main
} // end of Main class