import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	for(int i=0;i<3;i++)
    		list.add(Integer.valueOf(st.nextToken()));
    	list.sort(null);
    	
    	if(list.get(1)-list.get(0)==list.get(2)-list.get(1)) // ex) 1 2 3 ?
    		bw.write(list.get(2)+(list.get(2)-list.get(1))+"");
    	
    	else if(list.get(2)-list.get(1)>list.get(1)-list.get(0)) // ex) 1 2 ? 4
    		bw.write(list.get(1)+(list.get(1)-list.get(0))+"");
    	
    	else // ex) 1 ? 3 4
    		bw.write(list.get(1)-(list.get(2)-list.get(1))+"");

    	bw.close();
    } // end of main
} // end of class