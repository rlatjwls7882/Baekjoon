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
        
        // 팀의 수 N, 팀 레이팅 가입조건 K, 개인 레이팅 가입조건 L
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        int L = Integer.valueOf(st.nextToken());
        
        // VIP 클럽에 가입 가능한 팀 확인
        ArrayList<Integer> VIP = new ArrayList<>();
        
        while(N-->0) {
        	st = new StringTokenizer(br.readLine());
        	int x1 = Integer.valueOf(st.nextToken());
        	int x2 = Integer.valueOf(st.nextToken());
        	int x3 = Integer.valueOf(st.nextToken());
        	
        	if(x1>=L&&x2>=L&&x3>=L&&x1+x2+x3>=K) {
        		VIP.add(x1);
        		VIP.add(x2);
        		VIP.add(x3);
        	}
        }
        
        bw.write(VIP.size()/3+"\n");
        for(int i:VIP)
        	bw.write(i+" ");
        
        bw.close();
    } // end of main
} // end of Main class