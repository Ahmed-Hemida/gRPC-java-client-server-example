package com.grpc;

import com.grpc.generated.ProductInfoGrpc;
import com.grpc.generated.ProductInfoOuterClass;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        ProductInfoGrpc.ProductInfoBlockingStub stub = ProductInfoGrpc.newBlockingStub(channel);
        ProductInfoOuterClass.ProductID productID = stub.addProduct(
                ProductInfoOuterClass.Product.newBuilder()
                        .setName("Apple iPhone 11")
                        .setDescription("Meet Apple iPhone 11. " +
                                "All-new dual-camera system with " +
                                "Ultra Wide and Night mode.")
                        .setId("1")
                        .build());
         System.out.println(productID.getId());
        ProductInfoOuterClass.Product product = stub.getProduct(productID);
        System.out.println(product.toString());
        channel.shutdown();
    }
}