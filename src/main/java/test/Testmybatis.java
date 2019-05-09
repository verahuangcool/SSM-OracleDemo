package test;

import cn.qy.dao.AccountDao;
import cn.qy.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Testmybatis {
    @Test
    public  void run() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("sqlMapCofig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = factory.openSession();

        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> result = dao.findAll();

        for (Account a : result){
            System.out.println(a);
        }
        session.close();;
        inputStream.close();
    }

    @Test
    public  void run1() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("sqlMapCofig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = factory.openSession();

        AccountDao dao = session.getMapper(AccountDao.class);

        Account ac= new Account();
        ac.setId(2);
        ac.setMoney(50);
        ac.setName("popo");
         dao.saveAccount(ac);

        List<Account> result = dao.findAll();
        for (Account a : result){
            System.out.println(a);
        }
        session.commit();
        session.close();;
        inputStream.close();
    }
}
