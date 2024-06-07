package com.gameChanger.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Design {
    @Id
    private String fileName;
    private double locationX;
    private double locationY;
    private byte view;  // 해당 디자인 요소가 어느 시점에 있는지
    private byte group; // -128~127인데, 한 옷에 그룹이 100개 넘어가긴 힘들 듯
    private String prompt;  // ai로 생성한 이미지에 입력한 프롬프트
}
