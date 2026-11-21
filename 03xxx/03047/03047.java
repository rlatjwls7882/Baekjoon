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
		
		while(st.hasMoreTokens())
			list.add(Integer.valueOf(st.nextToken()));
		
		list.sort(null);
		String ABC = bf.readLine();
		
		for(int i=0;i<ABC.length();i++) {
			if(ABC.charAt(i)=='A')
				bw.write(list.get(0)+" ");
			
			else if(ABC.charAt(i)=='B')
				bw.write(list.get(1)+" ");
			
			else
				bw.write(list.get(2)+" ");
		}
		
		bw.close();
	} // end of main
} // end of main class