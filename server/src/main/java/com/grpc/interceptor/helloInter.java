

package com.grpc.interceptor;

import java.util.logging.Logger;

import io.grpc.Context;

import io.grpc.Contexts;
import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;

/**
 * helloInter
 */
public class helloInter implements io.grpc.ServerInterceptor {
    private static final Logger logger = Logger.getLogger(helloInter.class.getName());

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        // TODO Auto-generated method stub
       // System.out.println("Hello world with interceptor!");
       logger.info("======= [Server Interceptor] : Remote Method Invoked - " + call.getMethodDescriptor().getFullMethodName());
       
        ServerCall<ReqT, RespT> interceptedCall = new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void sendHeaders(Metadata responseHeaders) {
                super.sendHeaders(responseHeaders);
                // Post processing logic
                // System.out.println(" Post Proc Message : " + responseHeaders.get(/* specific header */));
            }
        };

        return Contexts.interceptCall(Context.current(), interceptedCall, headers, next);
    }

    
}