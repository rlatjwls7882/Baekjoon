import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import org.w3c.dom.ls.LSException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 주사위의 면의 수 n
        int n = Integer.valueOf(br.readLine());
        
        // 두 주사위의 면의 값 입력
        int[] first = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++)
        	first[i] = Integer.valueOf(st.nextToken());
        
        int[] second = new int[n];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++)
        	second[i] = Integer.valueOf(st.nextToken());
        
        // 첫번째 주사위가 두번째 주사위를 이기는 횟수와 지는 횟수 계산
        int win=0, lose=0;
        
        for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++) {
        		if(first[i]>second[j])
        			win++;
        		else if(first[i]<second[j])
        			lose++;
        	}
        
        // 이길 확률이 높은 주사위 출력
        if(win>lose)
        	bw.write("first");
        else if(win<lose)
        	bw.write("second");
        else
        	bw.write("tie");
        
        bw.close();
    } // end of main
} // end of Main class