package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentServiceImplSpyTest {

    @Autowired
    private StudentService studentService;

    @SpyBean
    private StudentDao studentDao;

    @Test
    public void insert(){
        //使用SpyBean盡量使用doReturn，可以避免一些不必要的錯誤發生
        Mockito.doReturn(100).when(studentDao).insert(Mockito.any());

        Student student = new Student();
        student.setName("test");
        student.setScore(60.0);
        student.setGraduate(false);
        Integer studentId = studentService.insert(student);

        assertEquals(100,studentId);
    }

    @Test
    public void getById(){
        Student student = studentService.getById(3);
        assertNotNull(student);
        assertEquals(3,student.getId());
        assertEquals("Judy",student.getName());
    }

}