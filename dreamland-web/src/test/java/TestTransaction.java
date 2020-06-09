import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import wang.dreamland.www.entity.User;
import wang.dreamland.www.service.UserService;

@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})

public class TestTransaction extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private UserService userService;

    @Test
    public void testSave()
    {
        User user = new User();
        user.setNickName("hello");
        user.setEmail("18818278903@163.com");
        userService.regist(user);
    }
}
