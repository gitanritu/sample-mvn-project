package sample.repository.login;

import sample.domain.login.Account;

public interface UserDao {

    Account getUser(String id);
}
