package com.techacademy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "authentication")
public class Authentication {

    /** 主キー。自動生成 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 従業員番号。255桁。null許可 */
    @Column(length = 20)
    private String code;

    /** パスワード。255桁。null許可 */
    @Column(length = 255)
    private String password;

    /** 権限。10桁。null許可 */
    @Column(length = 10)
    private String role;

    /** 従業員テーブルのID。null許可 */
    private Integer employee_id;
}
