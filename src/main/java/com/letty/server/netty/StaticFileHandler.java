package com.letty.server.netty;


import com.letty.mvc.http.Request;
import com.letty.mvc.http.Response;
import io.netty.channel.ChannelHandlerContext;

import lombok.extern.slf4j.Slf4j;



/**
 * @author lin
 */
@Slf4j
public class StaticFileHandler implements RequestHandler<Boolean> {

    @Override
    public Boolean handle(ChannelHandlerContext ctx, Request request, Response response) throws Exception {
        return null;
    }
}