import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N-1 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N>=1 일경우 출력
    	bw.write("int a;\n");
    	bw.write("int *ptr = &a;\n");
    	
    	// N>=2 일경우 출력
    	if(N>1)
    		bw.write("int **ptr2 = &ptr;\n");
    	
    	// N>=3 일경우 출력
    	for(int i=3;i<=N;i++) {
    		bw.write("int ");
    		
    		for(int j=0;j<i;j++)
    			bw.write("*");
    		
    		bw.write("ptr"+i+" = &ptr"+(i-1)+";\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class