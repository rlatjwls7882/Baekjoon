import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 방향
    	String EWSN = bf.readLine();
    	
    	// 점프 모양
    	String jumpShape1 = bf.readLine();
    	String jumpShape2 = bf.readLine();
    	
    	// 남쪽
    	if(EWSN.equals("S")) {
    		if(jumpShape1.equals(".O")&&jumpShape2.equals("P."))
    			bw.write("T");
    		else if(jumpShape1.equals("I.")&&jumpShape2.equals(".P"))
    			bw.write("F");
    		else if(jumpShape1.equals("O.")&&jumpShape2.equals(".P"))
    			bw.write("Lz");
    		else
    			bw.write("?");
    	}
    	
    	// 북쪽
    	else if(EWSN.equals("N")) {
    		if(jumpShape1.equals(".P")&&jumpShape2.equals("O."))
    			bw.write("T");
    		else if(jumpShape1.equals("P.")&&jumpShape2.equals(".I"))
    			bw.write("F");
    		else if(jumpShape1.equals("P.")&&jumpShape2.equals(".O"))
    			bw.write("Lz");
    		else
    			bw.write("?");
    	}
    	
    	// 동쪽
    	else if(EWSN.equals("E")) {
    		if(jumpShape1.equals("O.")&&jumpShape2.equals(".P"))
    			bw.write("T");
    		else if(jumpShape1.equals(".P")&&jumpShape2.equals("I."))
    			bw.write("F");
    		else if(jumpShape1.equals(".P")&&jumpShape2.equals("O."))
    			bw.write("Lz");
    		else
    			bw.write("?");
    	}
    	
    	// 서쪽
    	else {
    		if(jumpShape1.equals("P.")&&jumpShape2.equals(".O"))
    			bw.write("T");
    		else if(jumpShape1.equals(".I")&&jumpShape2.equals("P."))
    			bw.write("F");
    		else if(jumpShape1.equals(".O")&&jumpShape2.equals("P."))
    			bw.write("Lz");
    		else
    			bw.write("?");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class
