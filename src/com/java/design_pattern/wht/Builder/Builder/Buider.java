package com.java.design_pattern.wht.Builder.Builder;

import com.java.design_pattern.wht.Builder.RedPacket.RedPacket;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-9:58
 * @description
 */
public interface Buider {
    Buider setPublisherName(String publisherName);
    Buider setAcceptName(String acceptName);
    Buider setPacketAmount(BigDecimal packetAmount);
    Buider setPacketType(int packetType);
    Buider setPublishPacketTime(Date publishPacketTime);
    Buider setOpenPacketTime(Date openPacketTime);
    RedPacket redPacketBuild();
}
