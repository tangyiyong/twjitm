package com.twjitm.common.netstack.entity.http;

import com.twjitm.common.netstack.entity.AbstractNettyNetProtoBufMessage;
import com.twjitm.common.netstack.entity.NettyNetMessageBody;

/**
 * Created by 文江 on 2017/11/16.
 * 抽象http请求消息
 */
public abstract class AbstractNettyNetProtoBufHttpMessage extends AbstractNettyNetProtoBufMessage{
    public AbstractNettyNetProtoBufHttpMessage(String json){
        super(json);
        setNettyNetMessageHead(new NettyNetHttpMessageHead());
        setNettyNetMessageBody(new NettyNetMessageBody());
        initHeadCommId();
    }
}
