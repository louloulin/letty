package com.letty.server;

import com.letty.Letty;

/**
 * @author lin 
 */
public interface Server {

    /**
     * Start letty application
     *
     * @param letty letty instance
     * @param args  command arguments
     * @throws Exception
     */
    void start(Letty letty, String[] args) throws Exception;

    /**
     * Join current server
     *
     * @throws Exception
     */
    void join() throws Exception;

    /**
     * Stop current server
     */
    void stop();

    /**
     * Stop current, Will have been waiting for the service to stop
     */
    void stopAndWait();

}
