package problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if(students==null) return null;
		HashMap<Key, Student> map = new HashMap<>();
		Key key;
		for(Student st: students){
			key = new Key(st.getFirstName(), st.getLastName());
			map.put(key,st);;
		}
		return map;
	}

	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGpa = 0;
		for (Student st : maps.values()){
			totalGpa += st.getGpa();
		}
		double averageGpa = totalGpa/maps.size();
		return averageGpa;
	}
}
