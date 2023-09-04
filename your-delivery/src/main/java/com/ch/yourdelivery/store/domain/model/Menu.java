package com.ch.yourdelivery.store.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@Table(name = "stores")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class Menu {

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // 메뉴 이름
    private int price; // 가격
    private String imagePath; // 이미지 경로
    private int reviewScore; // 리뷰 점수
    private int minimumOrderPrice; //최소 주문 금액
    private int deliveryTip;//배달 팁

}
