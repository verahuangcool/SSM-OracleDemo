package cn.qy.dao;

import cn.qy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     *
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(id,name,money) values (#{id},#{name},#{money})")
    public  void saveAccount(Account account);
}
