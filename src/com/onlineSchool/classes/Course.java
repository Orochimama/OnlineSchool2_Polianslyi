package com.onlineSchool.classes;

public class Course {
    public static int counterCourse = 0;
    public final int COURSE_ID = counterCourse + 1;

    private Lecture lecture;
    private Student student;
    private Teacher teacher;

    public Course() {
        counterCourse++;

    }
}
