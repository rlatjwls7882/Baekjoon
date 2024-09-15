import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		
		// N명의 학생 나이순으로 정렬
		TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student stu1, Student stu2) {
				
				if(stu1.year!=stu2.year)
					return stu2.year-stu1.year;
				else if(stu1.mon!=stu2.mon)
					return stu2.mon-stu1.mon;
				else
					return stu2.day-stu1.day;
			}
		});
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.valueOf(st.nextToken());
			int mon = Integer.valueOf(st.nextToken());
			int year = Integer.valueOf(st.nextToken());
			students.add(new Student(name, day, mon, year));
		}
		
		// 나이가 가장 적은사람과 많은 사람 출력
		bw.write(students.first().name+"\n"+students.last().name);
		
		bw.close();
	} // end of main()
} // end of Main class

class Student {
	
	String name;
	int day, mon, year;
	
	public Student(String name, int day, int mon, int year) {
		this.name=name;
		this.day=day;
		this.mon=mon;
		this.year=year;
	}
}