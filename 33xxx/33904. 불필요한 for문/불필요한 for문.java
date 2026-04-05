import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			try {
				String string = br.readLine().trim();
				list.add(string);
			} catch (Exception e) {
				break;
			}
		}
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<i;j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					i--;
					j--;
				}
			}
		}
		for(int i=0;i<list.size()-1;i++) {
			boolean chk=false;
			for(char ch:list.get(list.size()-1).toCharArray()) {
				if(ch==list.get(i).charAt(9)) {
					chk=true;
					break;
				}
			}
			if(!chk) {
				list.remove(i);
				i--;
			}
		}
		
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<i;j++) bw.write(' ');
			bw.write(list.get(i)+"\n");
		}
		for(int j=0;j<list.size()-1;j++) bw.write(' ');
		bw.write(list.get(list.size()-1));
		bw.close();
	} // end of main
} // end of Main