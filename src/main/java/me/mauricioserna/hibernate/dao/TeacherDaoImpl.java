package me.mauricioserna.hibernate.dao;

import me.mauricioserna.hibernate.model.Teacher;

import javax.management.Query;
import java.util.List;

/**
 * Created by mauricio on 11/06/17.
 */

public class TeacherDaoImpl implements TeacherDao{

    private JavaApiSession javaApiSession;

    public TeacherDaoImpl() {
        javaApiSession = new JavaApiSession();
    }

    public void saveTeacher(Teacher teacher) {
        javaApiSession.getSession().persist(teacher);
        javaApiSession.getSession().getTransaction().commit();
    }

    public void deleteTeacher(Long idTeacher) {
    }

    public void updateTeacher(Teacher teacher) {
        javaApiSession.getSession().update(teacher);
        javaApiSession.getSession().getTransaction().commit();
    }

    public List<Teacher> findAllTeachers() {
        return javaApiSession.getSession().createQuery("from Teacher").list();
    }

    public Teacher findTeacherById(Long idTeacher) {
        return javaApiSession.getSession().get(Teacher.class, idTeacher);
    }

    public Teacher findByName(String name) {
        return javaApiSession.getSession().get(Teacher.class, name);
    }
}
