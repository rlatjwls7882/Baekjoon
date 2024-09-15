import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int min = 2_000_000_000;
		
		st = new StringTokenizer(bf.readLine());
		while(N--!=0)
			list.add(Integer.valueOf(st.nextToken()));
		
		for(int i=0;i<list.size()-1;i++)
			if(min>list.get(i)*X+list.get(i+1)*X)
				min=list.get(i)*X+list.get(i+1)*X;
		
		bw.write(min+"");
		bw.close();
	} // end of main
} // end of main class