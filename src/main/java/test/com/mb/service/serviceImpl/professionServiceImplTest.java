package test.com.mb.service.serviceImpl;


import com.mb.enity.profession;
import com.mb.service.professionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class professionServiceImplTest {

    @Autowired
    professionService p;

@Test
public void testAllProfession() throws Exception {

        List<profession> s = p.all("移动开发");

        System.out.print(s);

    }


} 



