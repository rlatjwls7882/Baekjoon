import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	String string = br.readLine();
        	
        	// 좋은놈인지 나쁜놈인지 확인
        	int g=0, b=0;
        	for(int i=0;i<string.length();i++) {
        		if(string.charAt(i)=='g'||string.charAt(i)=='G') g++;
        		else if(string.charAt(i)=='b'||string.charAt(i)=='B') b++;
        	}
        	
        	bw.write(string+" is ");
        	if(g>b) bw.write("GOOD\n");
        	else if(b>g) bw.write("A BADDY\n");
        	else bw.write("NEUTRAL\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class