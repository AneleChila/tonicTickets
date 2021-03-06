package com.rankinteractive.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionTypeEnum {

    BUY("buy"), SELL("sell");

    private String type;
}
