import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// 최대 상금 계산
		int maxPrice=0;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] dice = new int[4];
			for(int i=0;i<4;i++)
				dice[i] = Integer.valueOf(st.nextToken());
			Arrays.sort(dice);
			
			// 같은 눈 4개
			int price=0;
			if(dice[0]==dice[3])
				price=50000+dice[0]*5000;
			
			// 같은눈 3개
			else if(dice[0]==dice[2])
				price=10000+dice[0]*1000;
			else if(dice[1]==dice[3])
				price=10000+dice[1]*1000;
			
			// 같은눈 2개 2개
			else if(dice[0]==dice[1]&&dice[2]==dice[3])
				price=2000+(dice[0]+dice[2])*500;
			
			// 같은눈 2개
			else if(dice[0]==dice[1])
				price=1000+dice[0]*100;
			else if(dice[1]==dice[2])
				price=1000+dice[1]*100;
			else if(dice[2]==dice[3])
				price=1000+dice[2]*100;
			
			// 모두 다른 눈
			else price=dice[3]*100;
			
			if(maxPrice<price) maxPrice=price;
		}
		
		bw.write(maxPrice+"");
		
		bw.close();
	} // end of main
} // end of Main class