package info.yannxia.java.test.seckill.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/3/25.
 */

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {

    @Id
    private Long id;

    @Column(name = "remain")
    private BigDecimal remain;

    @Column(name = "total")
    private BigDecimal total;

}
