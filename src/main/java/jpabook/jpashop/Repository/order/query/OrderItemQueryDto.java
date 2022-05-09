package jpabook.jpashop.Repository.order.query;

import jpabook.jpashop.domain.Order;
import lombok.Data;

@Data
public class OrderItemQueryDto {
private Long orderId;
private String itemName;
private int orderPrice;
private int count;

    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
