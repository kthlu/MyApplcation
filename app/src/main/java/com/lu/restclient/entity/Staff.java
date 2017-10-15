package com.lu.restclient.entity;

import java.io.Serializable;

/**
 * Created by lu on 10/14/17.
 *
 * Description:员工信息
 */

public class Staff implements Serializable {
    private static final long serialVersionUID = -763618247875550322L;
    private String id;          //员工号（登陆账号）
    private String password;    //登陆密码
    private String type;        //登陆类型
    private String name;        //姓名
    private String department;  //部门
    private String title;       //职称
    private String cellphone;   //手机
    private String phone;       //电话（科室电话）
    private String email;       //邮箱
    private String createTime;  //创建时间

    public Staff(){}
    public Staff(String id, String password){
        this.id = id;
        this.password = password;
    }
    public Staff(String id, String password, String type){
        this.id = id;
        this.password = password;
        this.type = type;
    }
    public Staff(String id, String password, String type, String name, String department, String title, String cellphone, String phone, String email, String createTime) {
        this.id = id;
        this.password = password;
        this.type = type;
        this.name = name;
        this.department = department;
        this.title = title;
        this.cellphone = cellphone;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
