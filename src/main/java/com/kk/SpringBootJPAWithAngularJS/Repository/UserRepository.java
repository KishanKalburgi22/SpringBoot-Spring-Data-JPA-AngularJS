package com.kk.SpringBootJPAWithAngularJS.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kk.SpringBootJPAWithAngularJS.Model.User;

public interface UserRepository extends CrudRepository<User,String> {

}
