package com.coinbase.exchange.api.entity;

import java.math.BigDecimal;

public class NewMarketOrderSingle extends NewOrderSingle {
    private BigDecimal size; //optional: Desired amount in BTC

    public NewMarketOrderSingle(){
        setType("market");
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

}
