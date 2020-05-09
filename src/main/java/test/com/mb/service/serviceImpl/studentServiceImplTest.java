package test.com.mb.service.serviceImpl;

import com.mb.enity.student;
import com.mb.service.studentService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class studentServiceImplTest {


    @Autowired
    studentService studentService;

    @Test
    public void testAllStudent() throws Exception {

        List<student> list = studentService.allStudent();

        System.out.print(list);

    }
}