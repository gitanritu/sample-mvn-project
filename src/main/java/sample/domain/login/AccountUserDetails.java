package sample.domain.login;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AccountUserDetails implements UserDetails {

    private final Account account;
    private final Collection<GrantedAuthority> authorities;

    public AccountUserDetails(
            Account account, Collection<GrantedAuthority> authorities) {
        // (2)
        this.account = account;
        this.authorities = authorities;
    }

    // (3)
    public String getPassword() {
        return account.getPassword();
    }
    public String getUsername() {
        return account.getUsername();
    }
    public boolean isEnabled() {
        return account.isEnabled();
    }
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    // (4)
    public boolean isAccountNonExpired() {
        return true;
    }
    public boolean isAccountNonLocked() {
        return true;
    }
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // (5)
    public Account getAccount() {
        return account;
    }
}
