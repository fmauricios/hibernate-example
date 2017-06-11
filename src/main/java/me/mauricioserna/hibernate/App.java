package me.mauricioserna.hibernate;

import me.mauricioserna.hibernate.dao.TeacherDaoImpl;
import me.mauricioserna.hibernate.model.Teacher;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        Teacher teacher = new Teacher("Upatriyu", "https://avatarfiles.alphacoders.com/598/59888.jpg");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();

        teacherDaoImpl.saveTeacher(teacher);
        List<Teacher> teachers = teacherDaoImpl.findAllTeachers();

        for (Teacher t : teachers) {
            System.out.println("Nombre: " + t.getName());
        }


    }
}
