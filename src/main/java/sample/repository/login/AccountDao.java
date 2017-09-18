package sample.repository.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import sample.domain.login.Account;

import java.util.ArrayList;
import java.util.List;


@Repository
public class AccountDao implements UserDao {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession sqlSession ;

    public AccountDao(){
        System.out.println("AccountDao....");
    }


    public Account getUser(String username) {
        Account account =  sqlSession.selectOne("account.findOneByUsername", username);
        return account;
    }

    public List<String> getUserAuthority(String username) {
        List<String> listAuthority  =  sqlSession.selectList("account.findAuthoritiesByUsername", username);
        return listAuthority;
    }

}
