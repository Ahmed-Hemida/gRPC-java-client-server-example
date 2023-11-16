package com.grpc.interceptor;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;

public class helloInter implements io.grpc.ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interceptCall'");
    }
    
}
