package com.common.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jerax
 * @date 2019/10/28 5:00 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String brand;
    private Integer mile;
    private Chair chair;
}
