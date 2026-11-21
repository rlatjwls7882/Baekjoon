import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 이벤트에 관심있는 사람 N명의 참여도 입력
        int N = Integer.valueOf(br.readLine());
        String[] attend = new String[N];
        
        for(int i=0;i<N;i++)
        	attend[i] = br.readLine();
        
        // 이벤트에 참여하는 최대 인원수 계산
        int maxAttendance=0;
        int[] dayAttendance = new int[5];
        
        for(int i=0;i<5;i++) {
        	int attendance=0;
        	
        	for(int j=0;j<N;j++)
        		if(attend[j].charAt(i)=='Y')
        			attendance++;
        	
        	if(attendance>maxAttendance)
        		maxAttendance=attendance;
        	
        	dayAttendance[i] = attendance;
        }
        
        // 최대 인원수가 참여하는 날 출력
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<5;i++)
        	if(dayAttendance[i]==maxAttendance)
        		sb.append(i+1).append(",");
        
        bw.write(sb.substring(0, sb.length()-1));
        
        bw.close();
    } // end of main
} // end of Main class