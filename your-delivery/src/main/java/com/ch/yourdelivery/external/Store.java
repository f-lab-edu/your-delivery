package com.ch.yourdelivery.external;

import com.ch.yourdelivery.store.domain.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Store {
    private Long id;
    private String name;
    private String phoneNumber;
    private String image;
    private Category category;

}
