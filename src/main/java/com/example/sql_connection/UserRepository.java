package com.example.sql_connection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    //First part in <> : with whom to connect (Entity) , what is datatype of the primary key.





    //Generally in interface : you have to write custom queries , for Eg:
//    @Query("select * from user_info where id = ")
}
