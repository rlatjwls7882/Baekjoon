import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.valueOf(bf.readLine());
    	int cnt=0;
    	
    	for(int A=1;A<=500;A++)
    		for(int B=1;B<=A;B++)
    			if(A*A-B*B==N)
    				cnt++;
    	
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class