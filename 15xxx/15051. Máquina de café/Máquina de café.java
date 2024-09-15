import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int A = Integer.valueOf(bf.readLine()); //1층
		int B = Integer.valueOf(bf.readLine()); //2층
		int C = Integer.valueOf(bf.readLine()); //3층
		
		int case1 = B*2+C*4; //1층설치
		int case2 = A*2+C*2; //2층설치
		int case3 = A*4+B*2; //3층설치
		
		if(case1<=case2&&case1<=case3)
			bw.write(case1+"");
		
		else if(case2<=case1&&case2<=case3)
			bw.write(case2+"");
		
		else
			bw.write(case3+"");;
		
		bw.close();
	}
}