import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수열의 N개의 원소 입력
		int N = Integer.valueOf(br.readLine());
		
		int[] val = new int[3];
		for(int i=0;i<3;i++)
			val[i] = Integer.valueOf(br.readLine());

		// 다음에 등장할 수 계산
		int last = val[2];
		while(N-->3)
			last = Integer.valueOf(br.readLine());
		
		if(val[2]-val[1]==val[1]-val[0])
			bw.write(last+val[1]-val[0]+"");
		else
			bw.write((long)last*(val[1]/val[0])+"");
		
		bw.close();
	} // end of main
} // end of Main class