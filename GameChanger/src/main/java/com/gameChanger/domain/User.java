package com.gameChanger.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class User {
    @Id
    @Column(unique = true, length = 10)
    private String userId;
    private String pwd; // 입력된 값을 해시 함수 적용해서 db에 저장
    private String userName;
    @Column(unique = true, length = 15)
    private String nickname;
    @OneToMany
    private List<Clothes> clothesList;
    private String address; // 전체를 한 문자열로 할 지 배열로 도/시/동/... 이런 식으로 나눌 지
    private int phoneNumber;    // 01012345678 -> 1012345678로 저장. 2147483647까지만 가능. 해외 전화번호도 받아야 할지?
    private String email;
}
