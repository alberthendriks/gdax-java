package com.coinbase.exchange.api.marketdata;

public class MessageEX {
    public static class MessageType{
        public final static String RECEIEVED = "received";
        public final static String OPEN = "open";
        public final static String DONE = "done";
        public final static String MATCH = "match";
        public final static String CHANGE = "change";
        public final static String ERROR = "error";
    }
    public static class MessageSide{
        public final static String BUY = "buy";
        public final static String SELL = "sell";
    }
}
