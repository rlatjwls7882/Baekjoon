import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    	// 출력
    	bw.write("  ___  ___  ___\n");
    	bw.write("  | |__| |__| |\n");
    	bw.write("  |           |\n");
    	bw.write("   \\_________/\n");
    	bw.write("    \\_______/\n");
    	bw.write("     |     |\n");
    	bw.write("     |     |\n");
    	bw.write("     |     |\n");
    	bw.write("     |     |\n");
    	bw.write("     |_____|\n");
    	bw.write("  __/       \\__\n");
    	bw.write(" /             \\\n");
    	bw.write("/_______________\\");
    	
    	bw.close();
    } // end of main
} // end of Main class