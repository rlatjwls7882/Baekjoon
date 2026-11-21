import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 나무 조각 5개 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] wood = new int[5];
        
        for(int i=0;i<5;i++)
        	wood[i] = Integer.valueOf(st.nextToken());
        
        // 순서대로 정렬될때까지 반복
        int[] correct = {1, 2, 3, 4, 5};
        
        while(!Arrays.equals(wood, correct))
        	
        	// 1, 2, 3, 4번 과정
        	for(int i=1;i<5;i++)
        		if(wood[i-1]>wood[i]) {
        			
                    // 순서 변경
        			int tmp = wood[i-1];
        			wood[i-1] = wood[i];
        			wood[i] = tmp;
        			
                    // 변경된 순서 출력
        			for(int j=0;j<5;j++)
        				bw.write(wood[j]+" ");
        			bw.write("\n");
        		}

        bw.close();
    } // end of main
} // end of Main class