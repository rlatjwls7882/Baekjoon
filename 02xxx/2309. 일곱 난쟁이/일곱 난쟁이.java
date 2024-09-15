import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
        
        int sum=0;
        int[] key = new int[9];
        for(int i=0;i<9;i++) {
        	key[i] = Integer.valueOf(br.readLine());
        	sum += key[i];
        }
        Arrays.sort(key);
        
        for(int i=0;i<9;i++) {
        	for(int j=i+1;j<9;j++) {
        		if(sum-key[i]-key[j]==100) {
        			for(int k=0;k<9;k++) {
        				if(k!=i&&k!=j) {
        					bw.write(key[k]+"\n");
        				}
        			}
        			i=j=10;
        			break;
        		}
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class