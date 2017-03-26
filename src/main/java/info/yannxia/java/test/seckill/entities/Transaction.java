package info.yannxia.java.test.seckill.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by yann on 2017/3/26.
 */

@Entity
@Table(name = "TRANSACTION")
@Data
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "product_id")
    private Long projectId;
}
