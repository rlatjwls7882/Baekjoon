import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	ArrayList<Integer> list = new ArrayList<>();
    	while(st.hasMoreTokens()) {
    		list.add(Integer.valueOf(st.nextToken()));
    	}
    	
    	int N = Integer.valueOf(br.readLine());
    	TreeSet<Pair> pairs = new TreeSet<>();
    	for(int i=0;i<list.size();i++) {
    		for(int j=i+1;j<list.size();j++) {
    			if(list.get(i)+list.get(j)==N) {
    				pairs.add(new Pair(list.get(i), list.get(j)));
    			}
    		}
    	}
    	
    	for(Pair pair:pairs) {
    		bw.write(pair.a+" "+pair.b+"\n");
    	}
    	bw.write(pairs.size()+"");
    	
        bw.close();
    } // end of main
} // end of Main class

class Pair implements Comparable<Pair> {
	int a, b;
	
	public Pair(int a, int b) {
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		this.a=a;
		this.b=b;
	}
	
	@Override
	public int compareTo(Pair o) {
		if(this.a!=o.a) {
			return this.a-o.a;
		}
		return this.b-o.b;
	}
} // end of Pair class