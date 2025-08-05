package com.practice.AllRequesr.controller;

import com.practice.AllRequesr.module.Profile;
import com.practice.AllRequesr.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;

///////////////////////////////////---Crud Repository----/////////////////////////////////////////////////////
    //getAllProfile
    @GetMapping(value = "/AllProfile")
    public Iterable<Profile> getAllProfile(){
        return profileService.allProfile();
    }

    //addProfile
    @PostMapping(value = "addProfile")
    public String addProfile(@RequestBody List<Profile> profileList){
        return profileService.addProfileData(profileList);
    }


    //removeProfileUsingId
    @DeleteMapping(value = "/removeProfile/{id}")
    public void removeProfileUsingId(@PathVariable Long id){
        profileService.removeProfile(id);
    }

    //getProfileById
    @GetMapping(value = "/profileById/{id}")
    public Optional<Profile> getProfileById(@PathVariable Long id){
        return profileService.findProfileById(id);
    }


///////////////////////////////////---Custom Crud Repository----/////////////////////////////////////////////////////

    //updateProfileFirstNameUsingId
    @PutMapping(value = "/updateProfile/{id}/{firstName}")
    public String updateProfileFirstNameUsingId(@PathVariable long id , @PathVariable String firstName){
        return profileService.updateFirstName(id, firstName);
    }

    //getProfileByFirstName

    @GetMapping(value = "/profileByFn/{firstName}")
    public List<Profile> getProfileByFirstName(@PathVariable String firstName){
        return profileService.findProfileByFirstName(firstName);
    }

    //getProfile age greater then
    @GetMapping(value = "/profileByAge/{age}")
    public List<Profile> getProfileAgeGreaterThen(@PathVariable Integer age){
        return profileService.findProfileByGreaterAge(age);
    }

    //name something or age greater than something
    @GetMapping(value = "/profile/{firstName}/greaterThan/{age}")
    public List<Profile> getProfileByNameAndAgeAbove(@PathVariable("firstName") String firstName, @PathVariable("age") Integer age){
        return profileService.getProfileByNameAndAgeAbove(firstName , age);
    }

    // get profile above followers and below dateOfBirth
    @GetMapping(value = "/profile/followers/above/{followers}/dob/below/{dob}")
    public List<Profile> getProfileFollowersAboveAndDobBelow(@PathVariable Long followers , @PathVariable String dob){
        return profileService.getProfileFollowersAboveAndDobBelow(followers , dob);
    }


///////////////////////////////////---SQL QUERY----/////////////////////////////////////////////////////

    //getAgeInOder
    @GetMapping(value = "/profileSort")
    public List<Profile> getAgeInOder(){
        return profileService.getProfileOrderByAge();
    }

    //getAllProfileAboveFollower
    @GetMapping(value = "/profile/followers/{followers}")
    public List<Profile> getAllProfileAboveFollowers(@PathVariable Long followers){
        return profileService.getProfileAboveFollower(followers);
    }


    //updateFFollowerUsingID
    @PutMapping(value = "/profile/followers/{followers}/id/{id}")
    public void updateFFollowerUsingID( @PathVariable Long followers , @PathVariable Long id){
        profileService.updateFFollowerUsingID(followers , id);
    }

    //deleteProfileUsingIdBelowMethod
    @DeleteMapping(value = "/profile/Id/{id}")
    public void deleteProfileUsingId(@PathVariable Long id){
        profileService.deleteUsingID(id);
    }
}
