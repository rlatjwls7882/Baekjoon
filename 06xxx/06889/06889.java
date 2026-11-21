import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// n, m 입력
    	int n = Integer.valueOf(br.readLine());
    	int m = Integer.valueOf(br.readLine());
    	
    	// 배열에 n줄, m줄 입력
    	String[] arrN = new String[n];
    	
    	for(int i=0;i<n;i++)
    		arrN[i] = br.readLine();

    	String[] arrM = new String[m];
    	
    	for(int i=0;i<m;i++)
    		arrM[i] = br.readLine();
    	
    	// 모든 문장 출력
    	for(int i=0;i<n;i++)
    		for(int j=0;j<m;j++)
    			bw.write(arrN[i]+" as "+arrM[j]+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class