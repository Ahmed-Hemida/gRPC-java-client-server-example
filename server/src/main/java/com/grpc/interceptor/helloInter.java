

package com.grpc.interceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;

/**
 * helloInter
 */
public class helloInter implements io.grpc.ServerInterceptor {

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interceptCall'");
    }

    
}