package ex16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex16_1 {

	public static void main(String[] args) {

		List<Student> test = new ArrayList<>();
		test.add(new Student(1, "ミナト", 50));
		
		Set<String> prefs = new HashSet<>();
		Map<String, Integer> list = new HashMap<>();
		list.put("吉田茂", 6);
	}

}

class Student{
	int no;
	String name;
	int seiseki;
	public Student(int no, String name, int seiseki) {
		this.no = no;
		this.name = name;
		this.seiseki = seiseki;
	}
}
