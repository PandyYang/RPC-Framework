package com.pandy.myRPCVersion4.client;

import com.pandy.myRPCVersion4.common.RPCResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.AttributeKey;

/**
 *  Netty客户端处理器
 *  明确规定值处理一种类型的消息 例如：RPCResponse类型
 *  在initChannel中传入此处理器
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<RPCResponse> {

    /**
     * 响应每一种类型为RPCResponse的消息
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RPCResponse msg) throws Exception {
        // 接收到response, 给channel设计别名，让sendRequest里读取response
        AttributeKey<RPCResponse> key = AttributeKey.valueOf("RPCResponse");
        // 给Channel的key中设置msg
        ctx.channel().attr(key).set(msg);
        ctx.channel().close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
