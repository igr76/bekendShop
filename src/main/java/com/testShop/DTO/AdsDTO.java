package com.testShop.DTO;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * A DTO for the {@link com.testShop.Entity.AdEntity} entity
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdsDTO {

    Integer author;
    String image;
    Integer pk;
    @NotNull
    @Min(value = 1)
    Integer price;
    @NotNull(message = "Обязательно нужно заполнить поле")
    String title;
}
