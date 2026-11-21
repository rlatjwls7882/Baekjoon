import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수들의 합과 나온 횟수 계산
		int sum=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<10;i++) {
			int tmp = Integer.valueOf(br.readLine());
			
			sum += tmp;
			
			if(map.containsKey(tmp))
				map.put(tmp, map.get(tmp)+1);
			else
				map.put(tmp, 1);
		}
		
		// 평균 출력
		bw.write(sum/10+"\n");
		
		// 최빈값 계산
		int key=0, val=0;
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) 
			if(val<entry.getValue()) {
				val=entry.getValue();
				key=entry.getKey();
			}
		
		// 최빈값 출력
		bw.write(key+"");
		
		bw.close();
	} // end of main
} // end of Main class