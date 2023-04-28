
package Model_Services;

import Model_Beans.AssignedSubjects;
import Model_Beans.Course;
import Model_Beans.Department;
import Model_Beans.Routine;
import Model_Beans.Subject;
import java.util.List;

/**
 *
 * @author anujv
 */
public interface AcademicManagementServices {
    int addDepartment(Department dept);
    List<Department> showAllDepartments();
    Department findDepartmentUsingDeptId(int departementId);
    int updateDepartment(Department dept);
        
    //for Subjects
    int addSubject(Subject subject);
    List<Subject> displayAllSubject();
    int addAssignedSubject(AssignedSubjects assignedSubjects);
    List<AssignedSubjects> displayAssignedSubject(int faculty_id);
    
    //for Courses
    int addCourse(Course course);
    List<Course> displayAllCourse();
    
    //for routines
    int addRoutine(Routine routine);
    Routine showRoutineUsingDepartmentAndSemester(String department, int semester);
}
