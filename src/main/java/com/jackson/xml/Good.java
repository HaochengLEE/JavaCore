package com.jackson.xml;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lihaocheng
 * @createtime 2024/2/25
 */
@Data
@AllArgsConstructor
public class Good {
    private String name;

    private String price;

    private Integer num;
}
