import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMybatis {

    /**
     * 编写测试Mybatis查询方法
     */
    @Test
    public void Test1() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);

        //创建sqlsession对象
        SqlSession sqlSession = build.openSession();

        //创建代理对象
        AccountDao mapperdao = sqlSession.getMapper(AccountDao.class);

        List<Account> accounts = mapperdao.finAllaccount();

        for (Account account : accounts) {
            System.out.println(account);
        }

        sqlSession.close();
        in.close();
    }


    /**
     * 编写测试Mybatis修改方法
     * @throws IOException
     */
    @Test
    public void Test2() throws IOException {
        Account account = new Account();
        account.setName("你爹我");
        account.setMoney(100d);


        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);

        //创建sqlsession对象
        SqlSession sqlSession = build.openSession();

        //创建代理对象
        AccountDao mapperdao = sqlSession.getMapper(AccountDao.class);

//        List<Account> accounts = mapperdao.finAllaccount();
//
//        for (Account account1 : accounts) {
//            System.out.println(account1);
//        }

        //保存
        mapperdao.saveAccount(account);

        //提交事务
        sqlSession.commit();

        sqlSession.close();
        in.close();
    }
}
