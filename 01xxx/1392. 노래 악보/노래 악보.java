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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int Q = Integer.valueOf(st.nextToken());
        
        // 각각의 악보 연주 시간 입력
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=N;i++) {
        	int time = Integer.valueOf(br.readLine());
        	while(time-->0) list.add(i);
        }
        
        // 입력한 시간에 부르는 악보의 번호 출력
        while(Q-->0)
        	bw.write(list.get(Integer.valueOf(br.readLine()))+"\n");
        
        bw.close();
    } // end of main
} // end of Main class