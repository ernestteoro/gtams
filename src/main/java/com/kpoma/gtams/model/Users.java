package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

@Entity
public class Users implements UserDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_users", nullable = false)
    private int idUsers;
    @Basic
    @Column(name = "username", nullable = false, length = 45, unique = true)
    private String username;
    @Basic
    @Column(name = "password", nullable = false)
    private String password;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "isLogin", nullable = false)
    private int isLogin;
    @Basic
    @Column(name = "id_police")
    private int idPolice=0;
    @Basic
    @Column(name = "id_agent")
    private int idAgent;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "usersByIdUsers", cascade = CascadeType.ALL)
    private Collection<RolesUser> rolesUsersByIdUsers;

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(rolesUsersByIdUsers==null){
            return Collections.emptyList();
        }
        Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
        rolesUsersByIdUsers.forEach(role ->{
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoles()));
        });
        return grantedAuthorities;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(int isLogin) {
        this.isLogin = isLogin;
    }

    public int getIdPolice() {
        return idPolice;
    }

    public void setIdPolice(int idPolice) {
        this.idPolice = idPolice;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return idUsers == users.idUsers && isLogin == users.isLogin && idPolice == users.idPolice && idAgent == users.idAgent && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(createdAt, users.createdAt) && Objects.equals(updatedAt, users.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsers, username, password, createdAt, updatedAt, isLogin, idPolice, idAgent);
    }

    public Collection<RolesUser> getRolesUsersByIdUsers() {
        return rolesUsersByIdUsers;
    }

    public void setRolesUsersByIdUsers(Collection<RolesUser> rolesUsersByIdUsers) {
        this.rolesUsersByIdUsers = rolesUsersByIdUsers;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
