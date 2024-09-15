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
        
        while(true) {
        	try {
        		
        		// 정수가 공백으로 구분되어 입력
        		StringTokenizer st = new StringTokenizer(br.readLine());
				int[] nums = new int[st.countTokens()];
        		
				for(int i=0;st.hasMoreTokens();i++)
					nums[i] = Integer.valueOf(st.nextToken());
				
				// 이웃하는 정수들과의 곱 출력
				for(int i=0;i<nums.length;i++) {
					if(i==0)
						bw.write(nums[i]*nums[i+1]+" ");
					else if(i==nums.length-1)
						bw.write(nums[i-1]*nums[i]+"\n");
					else
						bw.write(nums[i-1]*nums[i]*nums[i+1]+" ");
				}
			} catch (Exception e) {break;}
        }
        
        bw.close();
    } // end of main
} // end of Main class