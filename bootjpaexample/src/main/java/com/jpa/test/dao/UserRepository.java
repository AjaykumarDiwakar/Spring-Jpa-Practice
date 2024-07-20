//package com.jpa.test.dao;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import com.jpa.test.entities.User;
//
//public interface UserRepository extends CrudRepository<User, Integer> {
//	@Query("select u fROM User u")
//	public List<User> findAllUser();
//	
//	@Query("select u FROM User u where u.name =:n")
//	public List<User> getUserByName(@Param("n") String name);
//	@Query(value = "select * from user where name=:n", nativeQuery=true)
//	public List<User> getUsers(@Param("n") String name);
//}
