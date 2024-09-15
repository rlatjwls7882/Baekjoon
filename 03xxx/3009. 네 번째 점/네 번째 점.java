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
		StringTokenizer st;
		
		ArrayList<Integer> listx = new ArrayList<Integer>();
		ArrayList<Integer> listy = new ArrayList<Integer>();
		String[] arr = new String[3];
		
		for(int i=0;i<3;i++) {
			arr[i] = bf.readLine();
			st = new StringTokenizer(arr[i]);
			
			int posx = Integer.valueOf(st.nextToken());
			int posy = Integer.valueOf(st.nextToken());

			if(listx.indexOf(posx)==-1)
				listx.add(posx);
			else
				listx.remove(listx.indexOf(posx));

			if(listy.indexOf(posy)==-1)
				listy.add(posy);
			else
				listy.remove(listy.indexOf(posy));
		} // end of for i
		
		bw.write(listx.get(0)+" "+listy.get(0));
		bw.close();
	} // end of main
} // end of main class