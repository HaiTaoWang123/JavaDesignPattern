package com.java.design_pattern.wht.Builder.RedPacket;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-9:41
 * @description
 */
public class RedPacket {
    private String publisherName;//红包发出人姓名
    private String acceptName;//红包接收人姓名
    private BigDecimal packetAmount;//红包金额
    private int packetType;//红包类型
    private Date publishTime;//红包发出时间
    private Date openPacketTime;//抢包时间

    public RedPacket(String publisherName, String acceptName, BigDecimal packetAmount, int packetType, Date publishTime, Date openPacketTime) {
        this.publisherName = publisherName;
        this.acceptName = acceptName;
        this.packetAmount = packetAmount;
        this.packetType = packetType;
        this.publishTime = publishTime;
        this.openPacketTime = openPacketTime;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getAcceptName() {
        return acceptName;
    }

    public BigDecimal getPacketAmount() {
        return packetAmount;
    }

    public int getPacketType() {
        return packetType;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public Date getOpenPacketTime() {
        return openPacketTime;
    }

    static class RedPacketBuilder{
        private String publisherName;//红包发出人姓名
        private String acceptName;//红包接收人姓名
        private BigDecimal packetAmount;//红包金额
        private int packetType;//红包类型
        private Date publishTime;//红包发出时间
        private Date openPacketTime;//抢包时间

        public RedPacketBuilder setPublisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public RedPacketBuilder setAcceptName(String acceptName) {
            this.acceptName = acceptName;
            return this;
        }

        public RedPacketBuilder setPacketAmount(BigDecimal packetAmount) {
            this.packetAmount = packetAmount;
            return this;
        }

        public RedPacketBuilder setPacketType(int packetType) {
            this.packetType = packetType;
            return this;
        }

        public RedPacketBuilder setPublishTime(Date publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public RedPacketBuilder setOpenPacketTime(Date openPacketTime){
            this.openPacketTime = openPacketTime;
            return this;
        }

        public RedPacket redPacketBuilder(){
            return new RedPacket(publisherName,acceptName,packetAmount,packetType,publishTime,openPacketTime);
        }
    }
}
