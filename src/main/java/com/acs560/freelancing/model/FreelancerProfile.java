//package com.acs560.freelancing.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "freelancer_profiles")
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class FreelancerProfile {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "userId")
//    private User user;
//
//    @Column(nullable = false)
//    private String phoneNumber;
//
//    @Column(nullable = false)
//    private String professionalTitle;
//
//    @Column(length = 500)
//    private List<String> skills; // Consider creating a separate entity if you want a structured list
//
//    @Column(length = 1000)
//    private List<String> otherLinks; // URLs to portfolios or personal websites
//
//    @Column(length = 500)
//    private String experienceSummary;
//
//    @Column
//    private Double hourlyRate;
//
//    @Column
//    private Double ratings;
//}
