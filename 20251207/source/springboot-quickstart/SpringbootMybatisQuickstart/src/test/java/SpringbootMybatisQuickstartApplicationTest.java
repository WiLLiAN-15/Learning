import com.aj.SpringbootMybatisQuickstartApplication;
import com.aj.mapper.AGVMapper;
import com.aj.pojo.AGV;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@ContextConfiguration(classes = {SpringbootMybatisQuickstartApplication.class})
@SpringBootTest
class SpringbootMybatisQuickstartApplicationTest {
    @Autowired
    private AGVMapper agvMapper;

    @Test
    public void testFindAll(){
        List<AGV> agvList = agvMapper.findAll();
        agvList.forEach(System.out::println);
    }
}
