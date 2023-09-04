package com.ch.yourdelivery.user.domain.model;

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
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//JPA Entity의 필수 요구사항
@AllArgsConstructor(access = AccessLevel.PRIVATE)//JPA에서 Builder를 사용할때 필수, 하지만 외부 노출 안되도록 private
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long
        id;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
}
