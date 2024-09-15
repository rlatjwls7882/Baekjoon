import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	
    	String[] strings = {"A B C D E F G H J L M", "A C E F G H I L M", "A C E F G H I L M", "A B C E F G H L M", "A C E F G H L M", "A C E F G H L M", "A C E F G H L M", "A C E F G H L M", "A C E F G H L M", "A B C F G H L M"};
    	int N = Integer.valueOf(br.readLine());
    	bw.write((strings[N-1].length()+1)/2+"\n"+strings[N-1]);
    	
        bw.close();
    } // end of main
} // end of Main