import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 팀의 이름 입력
        String team1name = br.readLine();
        String team2name = br.readLine();
        
        // S개의 경기 진행 과정 입력
        int S = Integer.valueOf(br.readLine());
        String game = br.readLine();
        
        // 팀1, 팀2의 점수 계산
        int[] score = new int[2];
        
        for(int i=0;i<S;i++) {
        
        	// 1점 득점
        	if(game.charAt(i)=='H')
        		score[i%2]++;

        	// 2점 득점
        	else if(game.charAt(i)=='D')
        		score[i%2]+=2;

        	// 1점 실점
        	else if(game.charAt(i)=='O')
        		score[(i+1)%2]++;
        	
        	// 게임 종료
        	if(score[0]>=7||score[1]>=7) break;
        }
        
        // 결과 출력
        bw.write(String.format("%s %d %s %d. "
                , team1name, Math.min(7, score[0]), team2name, Math.min(7, score[1])));
        
        if(score[0]>score[1])
        	bw.write(team1name+(score[0]>=7?" has won.":" is winning."));
        else if(score[1]>score[0])
        	bw.write(team2name+(score[1]>=7?" has won.":" is winning."));
        else
        	bw.write("All square.");
        
        bw.close();
    } // end of main
} // end of Main class