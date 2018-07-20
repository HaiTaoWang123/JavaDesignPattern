package com.java.design_pattern.wht.Builder;

import com.java.design_pattern.wht.Builder.Builder.RedPacketBuilder;
import com.java.design_pattern.wht.Builder.RedPacket.RedPacket;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-9:42
 * @description
 */
public class Builder_Main {
    public static void main(String[] args){
        RedPacket redPacket1 = RedPacket.getRedPacketInnerBuilder()
                .setPublisherName("In Heart")
                .setAcceptName("距离")
                .setPacketAmount(new BigDecimal(520))
                .setPublishTime(new Date())
                .setPacketType(1)
                .setOpenPacketTime(new Date())
                .redPacketInnerBuilder();
        System.out.println(redPacket1.toString());

        RedPacket redPacket2 = RedPacketBuilder.getRedPacketBuilder()
                .setPublisherName("TT")
                .setAcceptName("XX")
                .setPacketAmount(new BigDecimal(520))
                .setPublishPacketTime(new Date())
                .setPacketType(2)
                .setOpenPacketTime(new Date())
                .redPacketBuild();
        System.out.println(redPacket2.toString());
    }
}
