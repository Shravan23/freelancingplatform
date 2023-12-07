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
//@Table(name = "client_profiles")
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class ClientProfile {
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
//    private String location;
//
//    @Column(length = 500)
//    private String profileDescription;
//
//    // Assuming 'Job' model exists
//    @Column
//    private List<Long> postedJobs;
//
//    @Column
//    private Double rating;
//}