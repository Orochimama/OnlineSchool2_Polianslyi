import com.onlineSchool.classes.*;
import com.onlineSchool.service.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        CourseService courseService = new CourseService();
        LectureService lectureService = new LectureService();
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();
        HomeworkService homeworkService = new HomeworkService();
        AdditionalMaterialsService additionalMaterialsService = new AdditionalMaterialsService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to create a new course? yes/no");

        String creatNewCourse = scanner.nextLine();

        if (creatNewCourse.equals("yes")) {
            Course course1 = courseService.creatCourse();
            System.out.println("");
            System.out.println("You have created a Course object. Course ID is '1'");
            System.out.println("");
        } else if (creatNewCourse.equals("no")) {
            //выход из программы
        } else {
            //возаврат к сканеру
        }


        System.out.println("Choose which object you want to create:");
        System.out.println("lecture");
        System.out.println("teacher");
        System.out.println("student");
        System.out.println("nothin (for exit the menu)");

        String chooseObjectInCourse = scanner.nextLine();

        switch (chooseObjectInCourse) {
            case "lecture":
                Lecture lecture1 = lectureService.creatLecture(1);
                System.out.println("");
                System.out.println("You have created a Lecture object. Lecture Course ID is '1'");
                System.out.println("");
                System.out.println("Choose which object you want to create:");
                System.out.println("homework");
                System.out.println("additional materials");
                System.out.println("nothin (for exit the menu)");

                String chooseObjectInLecture = scanner.nextLine();

                switch (chooseObjectInLecture) {
                    case "homework":
                        Homework homework1 = homeworkService.creatHomework();
                        System.out.println("");
                        System.out.println("You have created a Homework object");
                        break;
                    case "additional materials":
                        AdditionalMaterials additionalMaterials1 = additionalMaterialsService.creatAdditionalMaterials();
                        System.out.println("");
                        System.out.println("You have created a Additional materials object");
                        break;
                    case "nothin":
                        break;
                    default:
                        System.out.println("Invalid value entered. Try typing in lower case.");
                        //cycle
                }
                break;
            case "teacher":
                Teacher teacher1 = teacherService.creatTeacher(1);
                System.out.println("");
                System.out.println("You have created a Teacher object. Teacher Course ID is '1'");
                break;
            case "student":
                Student student1 = studentService.creatStudent(1);
                System.out.println("");
                System.out.println("You have created a Student object. Student Course ID is '1'");
                break;
            case "nothin":
                break;
            default:
                System.out.println("Invalid value entered. Try typing in lower case.");
                //cycle
        }


//закрыть сканер
        //добавить уведомленте что было создано
        //
        //


    }
}