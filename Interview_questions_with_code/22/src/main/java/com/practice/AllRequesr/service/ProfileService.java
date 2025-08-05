package com.practice.AllRequesr.service;

import com.practice.AllRequesr.module.Profile;
import com.practice.AllRequesr.repository.IProfileRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    IProfileRepository iProfileRepository;

///////////////////////////////////---Crud Repository----/////////////////////////////////////////////////////

    public Iterable<Profile> allProfile() {
        return iProfileRepository.findAll();
    }

    public String  addProfileData(List<Profile> profileList) {
        Iterable<Profile> addProfile = iProfileRepository.saveAll(profileList);
        if(addProfile  !=null)return "Profile Data Added";
        else return "profile data is null provide the correct data";
    }



    //removeProfileUsingId
    public void removeProfile(Long id) {
        iProfileRepository.deleteById(id);
    }

    //findProfileById
    public Optional<Profile> findProfileById(Long id) {
        return iProfileRepository.findById(id);
    }


///////////////////////////////////---Custom Crud Repository----/////////////////////////////////////////////////////


    //updateProfileFirstNameUsingId
    @Transactional
    public String updateFirstName(long id, String firstName) {
        Optional<Profile> findId = iProfileRepository.findById(id);
        if(findId.isPresent()){
            iProfileRepository.updateProfileFirstName(id ,firstName);
            return "Updated";
        }else return "Id not found";
//        iProfileRepository.findById(id);

    }

    //findProfileByFirstName
    public List<Profile> findProfileByFirstName(String firstName) {
        return iProfileRepository.findByFirstName(firstName);
    }

    //findProfileAGeGreater
    public List<Profile> findProfileByGreaterAge(Integer age) {
        return iProfileRepository.findByAgeGreaterThan(age);
    }


    //name something or age greater than something
    public List<Profile> getProfileByNameAndAgeAbove(String firstName, Integer age) {
        return iProfileRepository.findByFirstNameOrAgeGreaterThan(firstName , age);
    }


    // get profile above followers and below dateOfBirth
    public List<Profile> getProfileFollowersAboveAndDobBelow(Long followers, String dob) {
        LocalDate myDate = LocalDate.parse(dob);
        return iProfileRepository.findByFollowersGreaterThanAndDobLessThan(followers ,myDate);
    }


///////////////////////////////////---SQL QUERY----/////////////////////////////////////////////////////

    //getAgeInOder
    public List<Profile> getProfileOrderByAge() {
        return iProfileRepository.getAllProfileInAGeOderASC();
    }


    //getAllProfileAboveFollower
    public List<Profile> getProfileAboveFollower(Long followers) {
        return iProfileRepository.getAllProfileAboveFollower(followers);
    }


    //updateFFollowerUsingID
    @Transactional
    public void updateFFollowerUsingID(Long followers, Long id) {
        iProfileRepository.updateFollowerUsingId(followers , id);
    }


    //deleteProfileUsingIdBelowMethod
    @Transactional
    public void deleteUsingID(Long id) {
        iProfileRepository.deleteUsingId(id);
    }
}
