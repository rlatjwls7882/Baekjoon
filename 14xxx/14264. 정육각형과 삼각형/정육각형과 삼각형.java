import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	double L = Integer.valueOf(bf.readLine());
    	
    	//L*L*루트3/4
    	bw.write(L*L/4*Math.sqrt(3)+"");
    	bw.close();
    } // end of main
} // end of Main class