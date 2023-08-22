package com.s_giken.training.webapp.model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeSearchCondition {
    private String name;
    private int amount;
    private Timestamp start_date;
    private Timestamp end_date;

    private String sortColName = "";// 初期化
    private String sortOrder = "";
}
