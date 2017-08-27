package com.remswork.project.alice.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.remswork.project.alice.model.support.Link;

public class Class {

    private long id;
    private Teacher teacher;
    private Subject subject;
    private Set<Schedule> scheduleList;
    private Section section;
    private Set<Student> studentList;
    private List<Link> links;

    public Class() {
        links = new ArrayList<Link>();
        scheduleList = new HashSet<Schedule>();
        studentList = new HashSet<Student>();
    }

    public Class(Teacher teacher, Subject subject, Set<Schedule> scheduleList, Section section,
                 Set<Student> studentList) {
        this();
        this.teacher = teacher;
        this.subject = subject;
        this.scheduleList = scheduleList;
        this.section = section;
        this.studentList = studentList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Set<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(Set<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
        links.add(link);
    }
}