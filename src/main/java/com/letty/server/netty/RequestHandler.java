package com.letty.server.netty;


import com.letty.mvc.http.Request;
import com.letty.mvc.http.Response;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author lin
 * @param <R>
 */
@FunctionalInterface
public interface RequestHandler<R> {

    R handle(ChannelHandlerContext ctx, Request request, Response response) throws Exception;

}
