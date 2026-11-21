import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	String[] color = new String[4];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	color[0] = st.nextToken();
    	color[1] = st.nextToken();
    	st = new StringTokenizer(br.readLine());
    	color[2] = st.nextToken();
    	color[3] = st.nextToken();
    	
    	TreeSet<Color> colors = new TreeSet<>();
    	for(int i=0;i<4;i++) {
    		for(int j=0;j<4;j++) {
    			colors.add(new Color(color[i], color[j]));
    		}
    	}
    	
    	while(!colors.isEmpty()) {
    		Color cur = colors.pollFirst();
    		bw.write(cur.head+" "+cur.body+"\n");
    	}
        
        bw.close();
    } // end of main
} // end of Main class

class Color implements Comparable<Color> {
	String head, body;
	
	public Color(String head, String body) {
		this.head=head;
		this.body=body;
	}
	
	@Override
	public int compareTo(Color o) {
		if(o.head.equals(this.head)) {
			return this.body.compareTo(o.body);
		}
		return this.head.compareTo(o.head);
	}
} // end of Color class