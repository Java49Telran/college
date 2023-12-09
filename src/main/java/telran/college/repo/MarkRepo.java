package telran.college.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.college.dto.*;
import telran.college.entities.*;

public interface MarkRepo extends JpaRepository<Mark, Long> {
	String JOIN_STUDENTS_MARKS = "FROM students_lecturers st join marks m on stid=st.id ";
	String JOIN_ALL = JOIN_STUDENTS_MARKS
			+ "join subjects sb on sb.id=suid ";
	
	List<SubjectNameScore> findByStudentName(String studentName);
}
