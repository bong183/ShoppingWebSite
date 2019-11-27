package com.sjy.service;

import com.sjy.dao.ProDao;
import com.sjy.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 14838
 * @create 2019-11-21-15:14
 */
@Service
public class ProServiceImpl implements ProService {

    @Resource
    private ProDao pd;

    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int product_id) {
        return pd.selectOne(product_id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int product_id) {
        return pd.delete(product_id);
    }
}
