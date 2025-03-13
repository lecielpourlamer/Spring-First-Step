package org.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PackageName  : org.example.demo.entity
 * Author       : shlim
 * Date         : 2025-03-13
 * Description  :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /** 이름 */
    private String name;

    /** 나이 */
    private int age;
}
