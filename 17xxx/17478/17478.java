import java.util.Scanner;

public class Main {	
	int i=-1;
	
	public static void main(String[] args) {
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		
		Main mm = new Main();
		mm.repeat(N+1);
	}
	
	
	void repeat(int x){
		i++; //몇번째 반복인지 확인 
		
		if(x==0) return; //마지막 반복에는 그냥 종료 
		
		for(int j=0;j<i;j++) System.out.printf("____");
		System.out.println("\"재귀함수가 뭔가요?\"");
		
		if(x==1){ //마지막 질문은 답이 다름 
			for(int j=0;j<i;j++) System.out.printf("____");
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			for(int j=0;j<i;j++) System.out.printf("____");
			System.out.println("라고 답변하였지.");
			return;
		} 
		
		for(int j=0;j<i;j++) System.out.printf("____");
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		
		for(int j=0;j<i;j++) System.out.printf("____");
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		
		for(int j=0;j<i;j++) System.out.printf("____");
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		
		repeat(--x); //다음 반복 
		i--;
		
		for(int j=0;j<i;j++) System.out.printf("____");
		System.out.println("라고 답변하였지.");
	}
}