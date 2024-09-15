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
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(st.nextToken()));
		list.add(Integer.valueOf(st.nextToken()));
		list.add(Integer.valueOf(st.nextToken()));
		list.sort(null);
		
		if(list.get(0)+list.get(1)==list.get(2))
			bw.write("1");
		else if(list.get(0)*list.get(1)==list.get(2))
			bw.write("2");
		else
			bw.write("3");
		
		bw.close();
	} // end of main
} // end of main class