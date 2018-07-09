package bhupen.in.controller;

/**
 * Created by BhupendraKumar on 7/9/18.
 */
public class Course {
    private String courseName;
    private int chapters;

    public Course(String courseName, int chapters) {
        this.courseName = courseName;
        this.chapters = chapters;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
