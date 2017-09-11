package sample.repository.login;

import sample.domain.login.User;

public interface UserMapper {

    User selectByUserName(String username);

    User selectByPrimaryKey(Integer id);

}