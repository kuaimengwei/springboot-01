package com.atguigu.springboot.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;

    private String uname;

    private String pwd;

    private String nicheng;

    private String sex;

    private String touxiang;

    private String aihao;

    private String haoma;

    private String jianjie;

    private String qianming;

    private String email;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng == null ? null : nicheng.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang == null ? null : touxiang.trim();
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao == null ? null : aihao.trim();
    }

    public String getHaoma() {
        return haoma;
    }

    public void setHaoma(String haoma) {
        this.haoma = haoma == null ? null : haoma.trim();
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }

    public String getQianming() {
        return qianming;
    }

    public void setQianming(String qianming) {
        this.qianming = qianming == null ? null : qianming.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", pwd=").append(pwd);
        sb.append(", nicheng=").append(nicheng);
        sb.append(", sex=").append(sex);
        sb.append(", touxiang=").append(touxiang);
        sb.append(", aihao=").append(aihao);
        sb.append(", haoma=").append(haoma);
        sb.append(", jianjie=").append(jianjie);
        sb.append(", qianming=").append(qianming);
        sb.append(", email=").append(email);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}