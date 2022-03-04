package jpabook.jpashop.domain.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {

private String name;
    private Long id;
    private int price;
    private int stockQuantity;
    public String author;
    public String isbn;
}
