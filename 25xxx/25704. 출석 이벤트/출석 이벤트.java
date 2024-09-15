import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		int P = Integer.valueOf(bf.readLine());
		int case1=50000, case2=50000;
		
		if(N>=15)
			case1 = P-2000;
		else if(N>=5)
			case1 = P-500;
		else
			case1 = P;
		
		if(N>=20)
			case2 = (int)(P*0.75);
		else if(N>=10)
			case2 = (int)(P*0.9);
		else
			case2 = P;
		
		if(case1<=0||case2<=0)
			bw.write("0");
		else if(case1<case2)
			bw.write(case1+"");
		else
			bw.write(case2+"");
		
		bw.close();
	} // end of main
} // end of main class