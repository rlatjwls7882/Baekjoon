import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 이름의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 이름들이 각각 증가하는지 감소하는지 확인
    	boolean increase=false, decrease=false;
    	String beforeName = br.readLine();
    	
    	while(N-->1) {
    		String curName = br.readLine();
    		
    		if(curName.compareTo(beforeName)>0)
    			increase=true;
    		else if(curName.compareTo(beforeName)<0)
    			decrease=true;
    		else
    			increase=decrease=true;
    		
    		if(increase&&decrease) break;
    		
    		beforeName = curName;
    	}
    	
    	if(increase&&decrease)
    		bw.write("NEITHER");
    	else if(increase)
    		bw.write("INCREASING");
    	else
    		bw.write("DECREASING");
    	
    	bw.close();
    } // end of main
} // end of Main class