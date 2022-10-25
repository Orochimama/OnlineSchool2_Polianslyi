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

        Lecture lecture1 = lectureService.creatLecture();
        lecture1.courseLectureId = course1.COURSE_ID;

        Lecture lecture2 = lectureService.creatLecture();
        lecture2.courseLectureId = course1.COURSE_ID;

        Lecture lecture3 = lectureService.creatLecture();
        lecture3.courseLectureId = course1.COURSE_ID;

        Lecture lecture4 = lectureService.creatLecture();
        lecture4.courseLectureId = course1.COURSE_ID;

        Lecture lecture5 = lectureService.creatLecture();
        lecture5.courseLectureId = course1.COURSE_ID;

        Lecture lecture6 = lectureService.creatLecture();
        lecture6.courseLectureId = course1.COURSE_ID;


        System.out.println("Course ID of the sixth lecture is " + lecture6.courseLectureId + ".");
        System.out.println("Total lecture created " + Lecture.counterLecture + ".");


    }
}