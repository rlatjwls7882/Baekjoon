import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 학생 목록
			ArrayList<Student> persons = new ArrayList<>();
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				persons.add(new Student(st.nextToken(), Double.valueOf(st.nextToken())));
			}
			Collections.sort(persons);
			
			// 가장 키가 큰 학생의 목록 출력
			bw.write(persons.get(0).name);
			
			for(int i=1;i<N;i++) {
				if(persons.get(i).height==persons.get(i-1).height) {
					bw.write(' ');
					bw.write(persons.get(i).name);
				} else {
					break;
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Student implements Comparable<Student> {
	String name;
	double height;
	
	public Student(String name, double height) {
		this.name=name;
		this.height=height;
	}
	
	@Override
	public int compareTo(Student o) {
		if(o.height>this.height) {
			return 1;
		} else if(o.height==this.height) {
			return 0;
		} else {
			return -1;
		}
	}
} // end of Student class