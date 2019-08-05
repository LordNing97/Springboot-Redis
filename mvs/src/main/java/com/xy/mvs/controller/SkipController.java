package com.xy.mvs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    /**
     * 跳转到登录页面
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 跳转到首页
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

//    public String index(Integer id,Model model){
//        model.addAttribute("id",id);
//        return "index";
//    }

    /**
     * 跳转到备件管理页面
     */
    @RequestMapping("/stockmanage")
    public String stockmanage(){
        return "stockmanage";
    }

    /**
     * 跳转到仓库设置页面
     */
    @RequestMapping("/warehouselist")
    public String warehouselist(){
        return "warehouselist";
    }

    /**
     * 跳转到工单管理页面
     */
    @RequestMapping("/workorder")
    public String workorder(){
        return "workorder";
    }

    /**
     * 跳转到工单统计页面
     */
    @RequestMapping("/processlist")
    public String processlist(){
        return "processlist";
    }

    /**
     * 跳转到工单设置页面
     */
    @RequestMapping("/workorderview")
    public String workorderview(){
        return "workorderview";
    }

    /**
     * 跳转到人员管理页面
     */
    @RequestMapping("/serviceperson")
    public String serviceperson(){
        return "serviceperson";
    }

    /**
     * 跳转到角色管理页面
     */
    @RequestMapping("/role")
    public String role(){
        return "role";
    }

    /**
     * 跳转到新建角色页面
     */
    @RequestMapping("/createrole")
    public String createrole(){
        return "createrole";
    }
}




















