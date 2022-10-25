

package com.onlineSchool.classes;

public class Lecture {
    public static int counterLecture = 0;
    public final int LECTURE_ID = counterLecture + 1;
    public int courseLectureId;


    private Homework homework;
    private AdditionelMaterials additionelMaterials;

    public Lecture() {
        counterLecture++;
    }
}
