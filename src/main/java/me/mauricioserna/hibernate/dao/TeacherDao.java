package me.mauricioserna.hibernate.dao;

import me.mauricioserna.hibernate.model.Teacher;

import java.util.List;

/**
 * Created by mauricio on 11/06/17.
 */
public interface TeacherDao {

    void saveTeacher(Teacher teacher);

    void deleteTeacher(Long idTeacher);
    void updateTeacher(Teacher teacher);
    List<Teacher> findAllTeachers();
    Teacher findTeacherById(Long idTeacher);
    Teacher findByName(String name);

}
