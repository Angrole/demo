package com.springboot.test.entity;


public class User {

    private String user_id;
    private String moible_no;
    private String card_no;
    private String user_name;
    private String zhifubao_phone;
    private String zhifubao_name;
    private String weixin_phone;
    private String weixin_name;
    private String master_id; //师傅ID
    private String profit_total; //钥匙总数
    private String user_status;  //用户状态
    private String goods_total; //奖励货总数

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getMoible_no() {
        return moible_no;
    }

    public void setMoible_no(String moible_no) {
        this.moible_no = moible_no;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getZhifubao_phone() {
        return zhifubao_phone;
    }

    public void setZhifubao_phone(String zhifubao_phone) {
        this.zhifubao_phone = zhifubao_phone;
    }

    public String getWeixin_phone() {
        return weixin_phone;
    }

    public void setWeixin_phone(String weixin_phone) {
        this.weixin_phone = weixin_phone;
    }

    public String getWeixin_name() {
        return weixin_name;
    }

    public void setWeixin_name(String weixin_name) {
        this.weixin_name = weixin_name;
    }

    public String getMaster_id() {
        return master_id;
    }

    public void setMaster_id(String master_id) {
        this.master_id = master_id;
    }

    public String getProfit_total() {
        return profit_total;
    }

    public void setProfit_total(String profit_total) {
        this.profit_total = profit_total;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getGoods_total() {
        return goods_total;
    }

    public void setGoods_total(String goods_total) {
        this.goods_total = goods_total;
    }

    public String getZhifubao_name() {
        return zhifubao_name;
    }

    public void setZhifubao_name(String zhifubao_name) {
        this.zhifubao_name = zhifubao_name;
    }
}
