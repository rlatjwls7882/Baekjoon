import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		DecimalFormat format = new DecimalFormat("0.00");
		StringTokenizer st = new StringTokenizer(bf.readLine());
		double minMoney=100000, X,Y;
		
		X = Double.valueOf(st.nextToken());
		Y = Double.valueOf(st.nextToken());
		
		if(minMoney>X*(1000/Y)) minMoney = X*(1000/Y);
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			st = new StringTokenizer(bf.readLine());
			
			X = Double.valueOf(st.nextToken());
			Y = Double.valueOf(st.nextToken());
			
			if(minMoney>X*(1000/Y)) minMoney = X*(1000/Y);
		} // end of while T
		
		bw.write(format.format(minMoney)+"");
		bw.close();
	} // end of main
} // end of main class