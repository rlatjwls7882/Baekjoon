import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        for(int i=N;i>0;i--) {
        	if(i==1) bw.write("1 bottle of beer on the wall, 1 bottle of beer.\n");
        	else bw.write(String.format("%d bottles of beer on the wall, %d bottles of beer.\n", i, i));
        	
        	bw.write("Take one down and pass it around, ");
        	if(i==2) bw.write("1 bottle");
        	else if(i==1) bw.write("no more bottles");
        	else bw.write(i-1+" bottles");
        	bw.write(" of beer on the wall.\n\n");
        }
        
        bw.write("No more bottles of beer on the wall, no more bottles of beer.\n");
        bw.write("Go to the store and buy some more, ");
        if(N==1) bw.write("1 bottle");
        else bw.write(N+" bottles");
        bw.write(" of beer on the wall.");
        
        bw.close();
    } // end of main
} // end of Main class