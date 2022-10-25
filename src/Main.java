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

        System.out.println(course1.COURSE_ID);
        System.out.println(Course.counterCourse);
        System.out.println(lecture1.LECTURE_ID);
        System.out.println(lecture3.LECTURE_ID);
        System.out.println(lecture6.LECTURE_ID);
        System.out.println(lecture1.courseLectureId);
        System.out.println(lecture5.courseLectureId);

        System.out.println("Course ID of the sixth lecture is " + lecture6.courseLectureId + ".");
        System.out.println("Total lecture created " + Lecture.counterLecture + ".");

        Course course2 = courseService.creatCourse();
        Lecture lecture7 = lectureService.creatLecture(course2.COURSE_ID);
        Lecture lecture8 = lectureService.creatLecture(course2.COURSE_ID);
        Lecture lecture9 = lectureService.creatLecture(course2.COURSE_ID);

        System.out.println(course2.COURSE_ID);
        System.out.println(Course.counterCourse);
        System.out.println(lecture7.LECTURE_ID);
        System.out.println(lecture9.LECTURE_ID);
        System.out.println(lecture7.courseLectureId);
        System.out.println(lecture9.courseLectureId);

        System.out.println("Course ID of the sixth lecture is " + lecture6.courseLectureId + ".");
        System.out.println("Total lecture created " + Lecture.counterLecture + ".");


    }
}