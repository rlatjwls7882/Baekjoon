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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 총 비용 계산
        double cost=0;
        
        while(st.hasMoreTokens()) {
        	
        	// 작업장에서 고객까지의 거리 입력
        	int km = Integer.valueOf(st.nextToken())/1000;
        	
        	// 1번 택배 회사
        	double case1=0;
        	
        	if(km>30)
        		case1=km*0.57;
        	else if(km>20)
        		case1=17;
        	else if(km>10)
        		case1=12;
        	else if(km>5)
        		case1=7;
        	else
        		case1=4;
        	
        	// 2번 택배 회사
        	double case2=0;
        	
        	if(km>40)
        		case2=9.25+km*0.55;
        	else if(km>20)
        		case2=3.25+km*0.7;
        	else if(km>5)
        		case2=1.25+km*0.8;
        	else if(km>5)
        		case2=1.25+km*0.8;
        	else if(km>2)
        		case2=1+km*0.85;
        	else
        		case2=0.9+km*0.9;
        	
        	// 가격이 싼 택배회사 선택
        	cost += case1<case2 ? case1:case2;
        }
        
        // 총 비용 출력
        bw.write(String.format("%.02f", cost));
        bw.close();
    } // end of main
} // end of Main class