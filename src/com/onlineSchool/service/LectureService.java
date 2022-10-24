package com.onlineSchool.service;

import com.onlineSchool.classes.Lecture;

public class LectureService {

    public Lecture creatLecture(int courseId) {
        return new Lecture(courseId);


    }
}
