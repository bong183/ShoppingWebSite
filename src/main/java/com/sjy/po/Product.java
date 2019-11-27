package com.sjy.po;

import lombok.Data;

/**
 * @author 14838
 * @create 2019-11-21-15:01
 */
@Data
public class Product {
    private int product_id;
    private String product_name;
    private int product_sum;
    private double product_price;
    private Status status;
}
