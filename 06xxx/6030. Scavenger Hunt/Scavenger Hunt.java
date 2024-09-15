import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // P와 Q 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = Integer.valueOf(st.nextToken());
        int Q = Integer.valueOf(st.nextToken());
        
        // P의 약수 x, Q의 약수 y 계산
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        for(int i=1;i<=P;i++)
        	if(P%i==0)
        		x.add(i);
        
        for(int i=1;i<=Q;i++)
        	if(Q%i==0)
        		y.add(i);
        
        // x, y 쌍 출력
        for(int i=0;i<x.size();i++)
        	for(int j=0;j<y.size();j++)
        		bw.write(x.get(i)+" "+y.get(j)+"\n");
        
        bw.close();
    } // end of main
} // end of Main class