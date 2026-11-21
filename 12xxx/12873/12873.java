import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	int N = Integer.valueOf(br.readLine());
    	
    	LinkedList<Integer> list = new LinkedList<>();
    	for(int i=1;i<=N;i++) {
    		list.add(i);
    	}
    	
    	int idx=0;
    	for(long i=1;i<N;i++) {
    		idx = (int)((idx+i*i*i-1)%list.size());
    		list.remove(idx);
    	}
    	bw.write(list.poll()+"");
    	
        bw.close();
    } // end of main
} // end of Main class