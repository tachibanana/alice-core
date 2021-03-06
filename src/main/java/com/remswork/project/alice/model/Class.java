package com.remswork.project.alice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.remswork.project.alice.model.support.Link;

@XmlRootElement
public class Class implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
    private Teacher teacher;
    private Subject subject;
    private Set<Schedule> scheduleList;
    private Section section;
    private Set<Student> studentList;
    private List<Link> links;

    public Class() {
        links = new ArrayList<>();
        scheduleList = new HashSet<>();
        studentList = new HashSet<>();
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

    @XmlTransient
    @Deprecated
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

    @XmlTransient
    @Deprecated
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
        boolean isExist = false;
        for (Link eachLink : links) {
            if(eachLink.getRel().equalsIgnoreCase(link.getRel())) {
                isExist = true;
                break;
            }
        }
        if(!isExist)
            links.add(link);
    }
}
