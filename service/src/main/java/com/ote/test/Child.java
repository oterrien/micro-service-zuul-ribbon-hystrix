package com.ote.test;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Child extends Parent {

    private String name;
}
