package com.java.design_pattern.wht.Builder.RedPacket;

import com.java.design_pattern.wht.Builder.Builder.RedPacketBuilder;

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

//    public static RedPacketBuilder getRedPacketBuilder(){
//        return new RedPacketBuilder();
//    }

    public static RedPacketInnerBuilder getRedPacketInnerBuilder(){
        return new RedPacketInnerBuilder();
    }

    public static class RedPacketInnerBuilder {
        private String publisherName;//红包发出人姓名
        private String acceptName;//红包接收人姓名
        private BigDecimal packetAmount;//红包金额
        private int packetType;//红包类型
        private Date publishTime;//红包发出时间
        private Date openPacketTime;//抢包时间

        public RedPacketInnerBuilder setPublisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public RedPacketInnerBuilder setAcceptName(String acceptName) {
            this.acceptName = acceptName;
            return this;
        }

        public RedPacketInnerBuilder setPacketAmount(BigDecimal packetAmount) {
            this.packetAmount = packetAmount;
            return this;
        }

        public RedPacketInnerBuilder setPacketType(int packetType) {
            this.packetType = packetType;
            return this;
        }

        public RedPacketInnerBuilder setPublishTime(Date publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public RedPacketInnerBuilder setOpenPacketTime(Date openPacketTime){
            this.openPacketTime = openPacketTime;
            return this;
        }

        public RedPacket redPacketInnerBuilder(){
            return new RedPacket(publisherName,acceptName,packetAmount,packetType,publishTime,openPacketTime);
        }
    }

    @Override
    public String toString() {
        return publishTime+":"+publisherName +"给"+acceptName+"发了"+packetAmount+"元的红包"+
                "\n"+
               openPacketTime+ ":"+acceptName+"打开了红包，收到红包的她非常高兴，深情地亲吻了一下"+publisherName;
    }
}
