import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 사탕 상자의 개수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	// 총 가져가는 사탕의 개수 계산
    	PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int candies=0;
    	
    	while(N-->0) {
    		int tmp=0;
    		
    		// 입력 데이터가 이상함
    		try {
    			tmp = Integer.valueOf(st.nextToken());
			} catch (Exception e) {
				tmp = Integer.valueOf(br.readLine().trim());
			}
    		
    		if(tmp%2==0) candies+=tmp;
    		else odd.add(tmp);
    	}
    	
    	for(int i=odd.size()/2*2;i>0;i--)
    		candies += odd.poll();
    	
    	// 한명이 가져가는 사탕의 개수
    	bw.write(candies/2+"");
    	
    	bw.close();
    } // end of main
} // end of Main class