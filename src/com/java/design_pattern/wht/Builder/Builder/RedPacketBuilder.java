package com.java.design_pattern.wht.Builder.Builder;

import com.java.design_pattern.wht.Builder.RedPacket.RedPacket;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-9:47
 * @description
 */
public class RedPacketBuilder implements Buider {
    private String publisherName;//红包发出人姓名
    private String acceptName;//红包接收人姓名
    private BigDecimal packetAmount;//红包金额
    private int packetType;//红包类型
    private Date publishTime;//红包发出时间
    private Date openPacketTime;//抢包时间

    public static RedPacketBuilder getRedPacketBuilder(){
        return new RedPacketBuilder();
    }

    @Override
    public Buider setPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    @Override
    public Buider setAcceptName(String acceptName) {
        this.acceptName = acceptName;
        return this;
    }

    @Override
    public Buider setPacketAmount(BigDecimal packetAmount) {
        this.packetAmount = packetAmount;
        return this;
    }

    @Override
    public Buider setPacketType(int packetType) {
        this.packetType = packetType;
        return this;
    }

    @Override
    public Buider setPublishPacketTime(Date publishPacketTime) {
        this.publishTime = publishPacketTime;
        return this;
    }

    @Override
    public Buider setOpenPacketTime(Date openPacketTime) {
        this.openPacketTime = openPacketTime;
        return this;
    }

    @Override
    public RedPacket redPacketBuild() {
        return new RedPacket(publisherName,acceptName,packetAmount,packetType,publishTime,openPacketTime);
    }
}
