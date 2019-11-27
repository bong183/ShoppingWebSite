package com.sjy.service;

import com.sjy.dao.StaDao;
import com.sjy.po.Product;
import com.sjy.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 14838
 * @create 2019-11-21-15:19
 */
@Service
public class StaServiceImpl implements StaService {

    @Resource
    private StaDao sd;

    public List<Status> selectAll() {
        return sd.selectAll();
    }

    public Status selectOne(int status_id) {
        return sd.selectOne(status_id);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int update(Status status) {
        return sd.update(status);
    }

    public int delete(int status_id) {
        return sd.delete(status_id);
    }
}
