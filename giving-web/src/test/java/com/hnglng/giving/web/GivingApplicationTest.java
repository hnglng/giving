package com.hnglng.giving.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by huang_liang on 2017/2/23.
 */

//@Transactional
//@SpringBootTest(classes = GivingApplication.class)
//@RunWith(SpringRunner.class)
public class GivingApplicationTest {
        /*

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        assertEquals(20, u.getAge().intValue());
    }

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        // insert一条数据，并select出来验证
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        assertEquals(20, u.getAge().intValue());

        // update一条数据，并select出来验证
        u.setAge(30);
        userMapper.update(u);
        u = userMapper.findByName("AAA");
        assertEquals(30, u.getAge().intValue());

        // 删除这条数据，并select验证
        userMapper.delete(u.getId());
        u = userMapper.findByName("AAA");
        assertEquals(null, u);

        u = new User("BBB", 30);
        userMapper.insertByUser(u);
        assertEquals(30, userMapper.findByName("BBB").getAge().intValue());

        Map<String, Object> map = new HashMap<>();
        map.put("name", "CCC");
        map.put("age", 40);
        userMapper.insertByMap(map);
        assertEquals(40, userMapper.findByName("CCC").getAge().intValue());

        List<User> userList = userMapper.findAll();
        for(User user : userList) {
            assertEquals(null, user.getId());
            assertNotEquals(null, user.getName());
        }

    }
    */

}
