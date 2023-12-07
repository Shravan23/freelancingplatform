//package com.acs560.freelancing.configuration;
//
//import com.acs560.freelancing.repository.ClientProfileRepository;
//import com.acs560.freelancing.repository.FreelancerProfileRepository;
//import com.acs560.freelancing.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SecurityService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private ClientProfileRepository clientProfileRepository;
//
//    @Autowired
//    private FreelancerProfileRepository freelancerProfileRepository;
//
//    public boolean isOwnerOfClientProfile(Authentication authentication, Long profileId) {
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return false;
//        }
//
//        String username = ((UserDetails) authentication.getPrincipal()).getUsername();
//        return clientProfileRepository.findById(profileId)
//                .map(ClientProfile::getUser)
//                .map(user -> user.getUsername().equals(username))
//                .orElse(false);
//    }
//
//    public boolean isOwnerOfFreelancerProfile(Authentication authentication, Long profileId) {
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return false;
//        }
//
//        String username = ((UserDetails) authentication.getPrincipal()).getUsername();
//        return freelancerProfileRepository.findById(profileId)
//                .map(FreelancerProfile::getUser)
//                .map(user -> user.getUsername().equals(username))
//                .orElse(false);
//    }
//}
