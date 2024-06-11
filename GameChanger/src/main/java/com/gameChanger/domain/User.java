package com.gameChanger.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemUserId;

    @Column(unique = true, length = 10)
    private String userId;
    private String password;
    private String userName;

    @OneToMany
    private List<Clothes> clothesList;

    @Column(unique = true, length = 15)
    private String nickname;
    private String address;
    private int phoneNumber;
    private String email;

    private UserRole role;
}
