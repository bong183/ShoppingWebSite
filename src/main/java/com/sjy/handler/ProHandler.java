package com.sjy.handler;

import com.sjy.po.Product;
import com.sjy.service.ProService;
import com.sjy.service.StaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 14838
 * @create 2019-11-21-15:15
 */
@Controller
@RequestMapping("/product")
public class ProHandler {

    /**
     * git config --global user.name "bong183"
     * git config --global user.email "1483823592@qq.com"
     */
    @Resource
    private ProService ps;

    @Resource
    private StaService ss;

    /**
     * 查询全部
     * @param model
     * @return
     */
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        model.addAttribute("proList",ps.selectAll());
        return "select";
    }

    /**
     * 查询单个
     * @param product_id
     * @param model
     * @return
     */
    @RequestMapping("/selectOne")
    public String selectOne(int product_id,Model model){
        model.addAttribute("pro",ps.selectOne(product_id));
        model.addAttribute("statusList",ss.selectAll());
        return "update";
    }

    /**
     * 修改
     * @param product
     * @return
     */
    @RequestMapping("/update")
    public String update(Product product){
        ps.update(product);
        return "redirect:/product/selectAll";
    }

    /**
     * 添加
     * @param product
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Product product){
        ps.insert(product);
        return "redirect:/product/selectAll";
    }

    /**
     * 删除
     * @param product_id
     * @return
     */
    @RequestMapping("/delete")
    public String delete(int product_id){
        ps.delete(product_id);
        return "redirect:/product/selectAll";
    }
    /**
     * 跳转添加页面
     * @return
     */
    @RequestMapping("/toinsert")
    public String toinsert(Model model){
        model.addAttribute("statusList",ss.selectAll());
        return "insert";
    }

}
