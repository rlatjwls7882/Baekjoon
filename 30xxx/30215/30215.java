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
        
        // O박사, Alyssa, Konari의 나이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int O = Integer.valueOf(st.nextToken());
        int Al = Integer.valueOf(st.nextToken());
        int Ko = Integer.valueOf(st.nextToken());
        
        // a와 k가 존재하는지 확인
        boolean exist=false;
        
        isExist:
        for(int a=1;a*Al<O;a++)
        	for(int k=1;a*Al+k*Ko<=O;k++)
        		if(a*Al+k*Ko==O) {
        			exist=true;
        			break isExist;
        		}
        
        bw.write(exist?"1":"0");
        
        bw.close();
    } // end of main
} // end of Main class