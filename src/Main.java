import com.onlineSchool.classes.Course;
import com.onlineSchool.classes.Lecture;
import com.onlineSchool.service.CourseService;
import com.onlineSchool.service.LectureService;

import java.util.concurrent.Callable;


public class Main {

    public static void main(String[] args) {

        CourseService courseService = new CourseService();
        Course course1 = courseService.creatCourse();


        LectureService lectureService = new LectureService();
        Lecture lecture1 = lectureService.creatLecture(course1.COURSE_ID);
        Lecture lecture2 = lectureService.creatLecture(course1.COURSE_ID);
        Lecture lecture3 = lectureService.creatLecture(course1.COURSE_ID);
        Lecture lecture4 = lectureService.creatLecture(course1.COURSE_ID);
        Lecture lecture5 = lectureService.creatLecture(course1.COURSE_ID);
        Lecture lecture6 = lectureService.creatLecture(course1.COURSE_ID);


        System.out.println(Course.counterCourse);
        System.out.println(Lecture.counterLecture);
        System.out.println(course1.COURSE_ID);
        System.out.println(lecture5.LECTURE_ID);


    }
}