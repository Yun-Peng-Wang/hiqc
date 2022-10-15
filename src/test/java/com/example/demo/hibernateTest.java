package com.example.demo;



import com.example.demo.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class hibernateTest {
    // Session工厂  Session:数据库会话  代码和数据库的一个桥梁
    private SessionFactory sf;

    @Before
    public void init() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();

        //2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂

        sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();;
    }
    @Test
    public void testC(){
        // session进行持久化操作
        try(Session session = sf.openSession()){
            Transaction tx = session.beginTransaction();

            UserEntity user = new UserEntity();
            user.setUserName("test1");
            user.setPassword("123");
            user.setRoleId(1);
            session.save(user);

            tx.commit();
        }

    }
}
