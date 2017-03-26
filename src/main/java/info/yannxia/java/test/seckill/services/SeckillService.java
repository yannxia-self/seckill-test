package info.yannxia.java.test.seckill.services;

import info.yannxia.java.test.seckill.entities.Product;
import info.yannxia.java.test.seckill.entities.Transaction;
import info.yannxia.java.test.seckill.entities.User;
import info.yannxia.java.test.seckill.repositories.ProductRepository;
import info.yannxia.java.test.seckill.repositories.TransactionRepository;
import info.yannxia.java.test.seckill.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

/**
 * Created by yann on 2017/3/26.
 */

@Service
@Slf4j
public class SeckillService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public Optional<Transaction> seckill(Long userId, Long productId) {

        Optional<Transaction> transactionOpt = Optional.empty();

        Optional<User> userOpt = userRepository.findById(userId);
        Optional<Product> productOpt = productRepository.findById(productId);

        if (userOpt.isPresent() && productOpt.isPresent()) {
            User user = userOpt.get();
            Product product = productOpt.get();
            if (product.getTotal() <= 0) {
                log.error("project remain empty");
                return transactionOpt;
            }
            if (user.getBalance().compareTo(product.getPrice()) < 0) {
                log.error("user remain is not engouh");
                return transactionOpt;
            }
            Transaction transaction = Transaction.builder()
                    .projectId(productId)
                    .userId(userId)
                    .build();
            transaction = transactionRepository.save(transaction);

            user.setBalance(user.getBalance().subtract(product.getPrice()));
            product.setTotal(product.getTotal() - 1);

            return Optional.of(transaction);

        } else {
            log.error("user or product is not exist");
            return Optional.empty();
        }
    }
}
