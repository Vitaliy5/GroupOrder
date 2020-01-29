package org.interlink.grouporder.splitbill.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    private String name;
    private String email;
    private int price;
    private int count = 1;
}
