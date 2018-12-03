package com.letty.server.netty;

import io.netty.channel.MultithreadEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import lombok.Builder;
import lombok.Getter;

/**
 * @author lin
 */
@Builder
@Getter
public class NettyServerGroup {

    private Class<? extends ServerSocketChannel> socketChannel;
    private MultithreadEventLoopGroup boosGroup;
    private MultithreadEventLoopGroup workerGroup;
}
