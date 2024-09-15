import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 격파해야 할 기지의 수 N, 각 기지의 층 수 M, 현재 김병장의 전투력 P
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        long P = Long.valueOf(st.nextToken());
        
        // 김병장이 임무를 달성할 수 있는지 확인
        boolean missionFailed=false;
        
        while(N-->0&&!missionFailed) {
        	
        	// 적군과 아이템의 수 확인
        	st = new StringTokenizer(br.readLine());
        	PriorityQueue<Long> enermy = new PriorityQueue<>();
        	int item=0;
        	
        	for(int i=0;i<M;i++) {
        		long tmp = Long.valueOf(st.nextToken());
        		if(tmp==-1)
        			item++;
        		else
        			enermy.add(tmp);
        	}
        	
        	// 기지 격파
        	while(!enermy.isEmpty()||item!=0) {
        		if(!enermy.isEmpty()&&P>=enermy.peek())
        			P += enermy.poll();
        		else if(item!=0) {
        			P*=2;
        			item--;
        		}
        		else {
        			missionFailed=true;
        			break;
        		}
        	}
        }
        
        bw.write(missionFailed?"0":"1");
        
        bw.close();
    } // end of main
} // end of Main class