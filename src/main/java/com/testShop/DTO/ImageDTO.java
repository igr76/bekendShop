package com.testShop.DTO;


import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * DTO  для {@link com.testShop.Entity.ImageEntity} картинки
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ImageDTO {

    String image;



}
