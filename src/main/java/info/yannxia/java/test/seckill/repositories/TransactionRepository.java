package info.yannxia.java.test.seckill.repositories;

import info.yannxia.java.test.seckill.entities.Product;
import info.yannxia.java.test.seckill.entities.Transaction;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.LockModeType;

/**
 * Created by yann on 2017/3/26.
 */
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
