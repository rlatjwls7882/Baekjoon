import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 초기에 입력되어 있는 문자열
		String string = br.readLine();
		
		LinkedList<Character> list = new LinkedList<>();
		for(int i=0;i<string.length();i++) {
			list.add(string.charAt(i));			
		}
		
		// M개의 명령 수행
		int M = Integer.valueOf(br.readLine());		
		ListIterator<Character> it = list.listIterator(list.size());
		while(M-->0) {
			String command = br.readLine();
			
			if(command.equals("L")) {
				if(it.hasPrevious()) {					
					it.previous();
				}
			} else if(command.equals("D")) {
				if(it.hasNext()) {					
					it.next();
				}
			} else if(command.equals("B")) {
				if(it.hasPrevious()) {					
					it.previous();
					it.remove();
				}
			} else {
				it.add(command.charAt(2));
			}
		}
		
		// 편집기에 입력되어 있는 문자열 출력
		for(char c:list) {			
			bw.write(c);
		}
		
		bw.close();
	} // end of main
} // end of Main class