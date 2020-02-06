package org.interlink.grouporder.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "member_order")
@Getter
@Setter
public class MemberOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "group_order_id")
    private GroupOrder groupOrder;
    private String name;
    private String email;
    @Column(columnDefinition = "TEXT")
    private String products;
    private int restaurantId;
    private int orderPrice;


}
