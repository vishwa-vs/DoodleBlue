package Student;

import java.util.logging.Logger;

public class Student extends Studentmodel {
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		Studentmodel obj = new Studentmodel();
		obj.setStudentnamebyid(101,"Vishwa");
		log.info(obj.getStudentnamebyid(101));
		obj.setStudentclassbyid(101, "MCA");
		obj.setStudentmarkbyid(101, 95);
		obj.setStudentsubjectbyid(101,"java");
		log.info("Class : "+obj.getStudentclassbyid(101));
		log.info("Subject : "+obj.getStudentsubjectbyid(101));
		log.info("Mark : "+obj.getStudentmarkbyid(101));
	}

}
