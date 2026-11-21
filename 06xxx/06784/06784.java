import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문제수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 학생의 답변 입력
        String[] student_answers = new String[N];
        
        for(int i=0;i<N;i++)
        	student_answers[i] = br.readLine();
        
        // 문제의 정답 입력
        String[] correct_answers = new String[N];
        
        for(int i=0;i<N;i++)
        	correct_answers[i] = br.readLine();
        
        // 학생이 정답을 맞춘 개수 계산
        int correct=0;
        
        for(int i=0;i<N;i++)
        	if(student_answers[i].equals(correct_answers[i]))
        		correct++;
        
        // 학생이 정답을 맞춘 개수 출력
        bw.write(correct+"");
        bw.close();
    } // end of main
} // end of Main class