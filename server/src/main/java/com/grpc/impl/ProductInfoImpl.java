package com.grpc.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.grpc.grpcImpl.ProductInfoGrpc;
import com.grpc.grpcImpl.ProductInfoOuterClass;

import io.grpc.Status;
import io.grpc.StatusException;

public class ProductInfoImpl extends ProductInfoGrpc.ProductInfoImplBase {

    // productMap for save data and retrieve it work as db or localstorge 
    private Map productMap = new HashMap<String, ProductInfoOuterClass.Product>();

    @Override
    public void addProduct(ProductInfoOuterClass.Product request,
            io.grpc.stub.StreamObserver<ProductInfoOuterClass.ProductID> responseObserver) {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        productMap.put(randomUUIDString, request);
        ProductInfoOuterClass.ProductID id = ProductInfoOuterClass.ProductID.newBuilder()
                .setId(randomUUIDString).build();
        responseObserver.onNext(id);
        responseObserver.onCompleted();

    }

    @Override
    public void getProduct(
            ProductInfoOuterClass.ProductID request,
            io.grpc.stub.StreamObserver<ProductInfoOuterClass.Product> responseObserver) {
        String id = request.getId();
        if (productMap.containsKey(id)) {
            responseObserver.onNext(
                    (ProductInfoOuterClass.Product) productMap.get(id));
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new StatusException(Status.NOT_FOUND));
        }
    }

}
