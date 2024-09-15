import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // M개의 연산 수행
        int M = Integer.valueOf(br.readLine());
        HashSet<Integer> S = new HashSet<Integer>();
        
        while(M-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	
        	// add x
        	if(command.equals("add"))
        		S.add(Integer.valueOf(st.nextToken()));
        	
        	// remove x
        	else if(command.equals("remove"))
        		S.remove(Integer.valueOf(st.nextToken()));
        	
        	// check x
        	else if(command.equals("check")) {
        		if(S.contains(Integer.valueOf(st.nextToken())))
        			bw.write("1\n");
        		else
        			bw.write("0\n");
        	}
        	
        	// toggle x
        	else if(command.equals("toggle")) {
        		int x = Integer.valueOf(st.nextToken());
        		
        		if(S.contains(x))
        			S.remove(x);
        		else
        			S.add(x);
        	}
        	
        	// all
        	else if(command.equals("all"))
        		for(int i=1;i<=20;i++)
        			S.add(i);
        	
        	else
        		S.clear();
        }
        
        bw.close();
    } // end of main
} // end of Main class