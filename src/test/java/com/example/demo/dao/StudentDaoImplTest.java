package com.example.demo.dao;

import com.example.demo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentDaoImplTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void getById(){
        Student student = studentDao.getById(3);
        assertNotNull(student);//不為null
        assertEquals("Judy",student.getName());
        assertEquals(100.0,student.getScore());
        assertTrue(student.isGraduate());
        assertNotNull(student.getCreateDate());
    }

    @Test
    @Transactional //加上此後，SpringBoot就會在完成單元測試後，rollback所有執行資料庫數據的操作
    public void deleteById(){
        studentDao.deleteById(3);

        Student student = studentDao.getById(3);
        assertNull(student);
    }

    @Test
    @Transactional
    public void insert(){
        Student student = new Student();
        student.setName("Kevin");
        student.setScore(66.2);
        student.setGraduate(true);

        Integer studentId = studentDao.insert(student);

        Student result = studentDao.getById(studentId);
        assertNotNull(result);
        assertEquals("Kevin",result.getName());
        assertEquals(66.2,result.getScore());
        assertTrue(result.isGraduate());
        assertNotNull(result.getCreateDate());
    }

    @Test
    @Transactional
    public void update(){
        Student student = studentDao.getById(3);
        student.setName("John");

        studentDao.update(student);

        Student result=studentDao.getById(3);
        assertNotNull(result);
        assertEquals("John",result.getName());
    }
}