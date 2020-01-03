package com.ccj.dao;

import com.ccj.entity.Student;
import com.ccj.entity.Teacher;
import com.ccj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class UserDaoTest {


    @Test
    public void getStudentList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList2();
        for (Student student:
             studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
