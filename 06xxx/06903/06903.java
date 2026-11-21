import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 가지의 높이 t, 가지 사이의 거리 s, 손잡이의 길이 h 입력
        int t = Integer.valueOf(br.readLine());
        int s = Integer.valueOf(br.readLine());
        int h = Integer.valueOf(br.readLine());
        
        // *  *  *
        // *  *  *
        // *  *  * 출력
        while(t-->0) {
        	for(int j=0;j<3;j++) {
        		bw.write("*");
        		
        		if(j!=2)
        			for(int k=0;k<s;k++)
        				bw.write(" ");
        	}
        	bw.write("\n");
        }
        
        // ******* 출력
        for(int i=0;i<s*2+3;i++)
        	bw.write("*");
        bw.write("\n");
        
        //    *
        //    * 출력
        for(int i=0;i<h;i++) {
        	for(int j=0;j<s+1;j++)
        		bw.write(" ");
        	bw.write("*\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class