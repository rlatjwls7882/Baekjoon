import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 토핑의 개수 N
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 서로 다른 치즈 토핑의 개수 계산
		HashSet<String> cheeseTopping = new HashSet<String>();
		while(N-->0) {
			String topping = st.nextToken();
			int idx=topping.length()-6;
			if(idx<0) continue;
			
			if(topping.charAt(idx++)=='C'&&topping.charAt(idx++)=='h'
               &&topping.charAt(idx++)=='e'&&topping.charAt(idx++)=='e'
               &&topping.charAt(idx++)=='s'&&topping.charAt(idx)=='e')
				cheeseTopping.add(topping);
		}
		
		// 콰트로치즈피자를 만들 수 있는지 확인
		if(cheeseTopping.size()>=4)
			bw.write("yummy");
		else
			bw.write("sad");
		
		bw.close();
	} // end of main()
} // end of Main class