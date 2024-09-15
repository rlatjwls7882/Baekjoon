import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(Integer.valueOf(st.nextToken()));
		list.add(Integer.valueOf(st.nextToken()));
		list.add(Integer.valueOf(st.nextToken()));
		list.sort(null);

		System.out.println(list.toArray()[1]);
	}
}