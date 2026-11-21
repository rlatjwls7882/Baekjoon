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
        
        // n개의 자판이 견디는 타자 수 입력
        int n = Integer.valueOf(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] keyboard = new int[n];
        
        for(int i=0;i<n;i++)
        	keyboard[i] = Integer.valueOf(st.nextToken());
        
        // k번 타자 누르기
        int k = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<k;i++)
        	keyboard[Integer.valueOf(st.nextToken())-1]--;
        
        // 자판이 고장났는지 확인
        for(int i=0;i<n;i++)
        	if(keyboard[i]<0)
        		bw.write("yes\n");
        	else
        		bw.write("no\n");
        
        bw.close();
    } // end of main
} // end of Main class