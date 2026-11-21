import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 데이터의 수 K
        int K = Integer.valueOf(br.readLine());
        
        for(int caseNum=1;caseNum<=K;caseNum++) {
        	
        	// 회사의 수 C, 구제금을 받은 회사의 수 B, 총 이사진의 수 n, 세율 r
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int C = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	int n = Integer.valueOf(st.nextToken());
        	int r = Integer.valueOf(st.nextToken());
        	
        	// 정부가 세금으로 회수하는 구제금 계산
        	long Totaltax=0;
        	
        	if(B!=0) {
        		
        		// 구제금을 받은 B개의 회사 목록
        		HashMap<String, Long> company = new HashMap<>();
        		st = new StringTokenizer(br.readLine());
        		
        		while(B-->0)
        			company.put(st.nextToken(), 0L);
        		
        		// 구제금 회수
        		while(n-->0) {
        			
        			// 이사진이 일하고 있는 회사 c, 받은 상여금 p
        			st = new StringTokenizer(br.readLine());
        			String c = st.nextToken();
        			long p = Long.valueOf(st.nextToken());
        			
        			if(company.containsKey(c))
        				Totaltax += p*r/100;
        		}
        	}
        	
        	// 구제금을 받은 회사가 없는 경우
        	else {
        		while(n-->-1)
        			br.readLine();
        	}
        	
        	bw.write(String.format("Data Set %d:\n%d\n\n", caseNum, Totaltax));
        }
        
        bw.close();
    } // end of main
} // end of Main class