import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		LinkedList<Integer> pizzaList = new LinkedList<>();
		pizzaList.add(Integer.valueOf(br.readLine()));
		
		// 얻을 수 있는 즐거움의 합 계산
		int happiness=0;
		while(!pizzaList.isEmpty()) {
			int B = pizzaList.poll();
			int C = B/2;
			B -= C;
			
			happiness += B*C;
			if(B>1) pizzaList.add(B);
			if(C>1) pizzaList.add(C);
		}
		
		bw.write(happiness+"");
		
		bw.close();
	} // end of main()
} // end of Main class