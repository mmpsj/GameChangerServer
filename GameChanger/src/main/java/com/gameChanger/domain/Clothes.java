package com.gameChanger.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Clothes {
    @Id
    private String clothesName;
    private String username;    // cloth's owner name
    private String shape;   // 기본 : 반팔 char나 int로 바이트 수 줄여도 됨
    private Color background;   // 다른 색 필요하면 문자열로 해서 색 지정할지도 / 혹은 프론트에서 색 정해서 전달
    @OneToMany
    private List<Design> imageFileList;
    private String view;    // 티셔츠 보는 시점. char나 int로 바이트 수 줄여도 됨
}
