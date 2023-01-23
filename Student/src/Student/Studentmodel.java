package Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Studentmodel {

	private String studentName;
	private String studentClass;
	private int studentId;
	private String studentSubject;
	private int studentMark;
	
	HashMap<Integer,String> nameMap=new HashMap<Integer,String>();
	HashMap<Integer,String> classMap=new HashMap<Integer,String>();
	HashMap<Integer,String> subjectMap=new HashMap<Integer,String>();
	HashMap<Integer,Integer> markMap=new HashMap<Integer,Integer>();
	public void setStudentnamebyid(int id,String name) {
		
		this.studentId = id;
		this.studentName = name;
		nameMap .put(id, name);
	}
	
	public String getStudentnamebyid(int id) {
		
		String name = nameMap.get(id);
		return name;
	}
	public void setStudentclassbyid(int id,String Class) {
		
		this.studentId = id;
		this.studentClass = Class;
		classMap .put(id, Class);
	}
		public String getStudentclassbyid(int id) {
		
		String Class = classMap.get(id);
		return Class;
		}
		
	public void setStudentsubjectbyid(int id,String subject) {
		
		this.studentId = id;
		this.studentSubject = subject;
		subjectMap .put(id, subject);
	}
	
public String getStudentsubjectbyid(int id) {
		
		String subject = subjectMap.get(id);
		return subject;
		}
	public void setStudentmarkbyid(int id,int mark) {
	
		this.studentId = id;
		this.studentMark = mark;
		markMap .put(id, mark);
}
public int getStudentmarkbyid(int id) {
		
		int mark = markMap.get(id);
		return mark;
		}
	public String getStudentName() {
		return studentName;
	} 
	
	public int getStudentId() {
		return studentId;
	} 
	
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentClass() {
		return studentClass;
	}
	
	
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	
	
	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	public int getStudentMark() {
		return studentMark;
	}	
}
