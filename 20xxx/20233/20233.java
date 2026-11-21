import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.valueOf(bf.readLine());
		int x = Integer.valueOf(bf.readLine());
		int b = Integer.valueOf(bf.readLine());
		int y = Integer.valueOf(bf.readLine());
		int T = Integer.valueOf(bf.readLine());
		
		int fee = 0;
		
		//첫번째 경우
		fee=a; //월 요금
		if(T>30)
			fee+=(T-30)*x*21; // 21일동안의 추가요금
		bw.write(fee+" ");
		
		//두번째 경우
		fee=b; //월 요금
		if(T>45)
			fee+=(T-45)*y*21; // 21일동안의 추가요금
		bw.write(fee+"");
			
		bw.close();
	} // end of main
} // end of main class