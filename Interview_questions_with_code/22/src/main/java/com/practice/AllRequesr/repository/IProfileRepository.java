package com.practice.AllRequesr.repository;

import com.practice.AllRequesr.module.Profile;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IProfileRepository extends CrudRepository<Profile , Long> {

///////////////////////////////////---Custom Crud Repository----/////////////////////////////////////////////////////


    //updateProfileFirstName
    @Modifying
    @Query("UPDATE Profile p SET p.firstName = :firstName WHERE p.id = :id")
    void updateProfileFirstName(@Param("id") Long id , @Param("firstName") String firstName);

    //findProfileByFirstName
    List<Profile> findByFirstName(String firstName);

    //findProfileAGeGreater
    List<Profile> findByAgeGreaterThan(Integer age);


    //name something or age greater than something
    List<Profile> findByFirstNameOrAgeGreaterThan(String firstName, Integer age);


    // get profile above followers and below dateOfBirth
    List<Profile> findByFollowersGreaterThanAndDobLessThan(Long followers , LocalDate myDate);


///////////////////////////////////---SQL QUERY----/////////////////////////////////////////////////////
    //getAgeInOder
    @Query(value = "select * from profile_table order by age asc" , nativeQuery = true)
    List<Profile> getAllProfileInAGeOderASC();


    //get All Profile were followers above
    @Query(value = " select * from PROFILE_TABLE where FOLLOWERS > :followers" , nativeQuery = true)
    List<Profile> getAllProfileAboveFollower(Long followers);


    //updateFFollowerUsingID
@Modifying // we use when something changing in database
    @Query(value = "update PROFILE_TABLE set  FOLLOWERS = :followers where ID = :id" , nativeQuery = true)
    void updateFollowerUsingId(Long followers , Long id );


    //deleteProfileUsingIdBelowMethod
    @Modifying
    @Query(value = "Delete from PROFILE_TABLE where ID <= :id" , nativeQuery = true)
    void deleteUsingId( Long id );
}
