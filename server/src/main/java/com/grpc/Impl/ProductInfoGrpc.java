package com.grpc.Impl;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * package ecommerce;
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: ProductInfo.proto")
public class ProductInfoGrpc {

  private ProductInfoGrpc() {}

  public static final String SERVICE_NAME = "ProductInfo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductInfoOuterClass.Product,
      ProductInfoOuterClass.ProductID> METHOD_ADD_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductInfo", "addProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(ProductInfoOuterClass.Product.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ProductInfoOuterClass.ProductID.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductInfoOuterClass.ProductID,
      ProductInfoOuterClass.Product> METHOD_GET_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProductInfo", "getProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(ProductInfoOuterClass.ProductID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ProductInfoOuterClass.Product.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductInfoStub newStub(io.grpc.Channel channel) {
    return new ProductInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProductInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductInfoFutureStub(channel);
  }

  /**
   * <pre>
   * package ecommerce;
   * </pre>
   */
  public static abstract class ProductInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProduct(ProductInfoOuterClass.Product request,
        io.grpc.stub.StreamObserver<ProductInfoOuterClass.ProductID> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_PRODUCT, responseObserver);
    }

    /**
     */
    public void getProduct(ProductInfoOuterClass.ProductID request,
        io.grpc.stub.StreamObserver<ProductInfoOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                ProductInfoOuterClass.Product,
                ProductInfoOuterClass.ProductID>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            METHOD_GET_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                ProductInfoOuterClass.ProductID,
                ProductInfoOuterClass.Product>(
                  this, METHODID_GET_PRODUCT)))
          .build();
    }
  }

  /**
   * <pre>
   * package ecommerce;
   * </pre>
   */
  public static final class ProductInfoStub extends io.grpc.stub.AbstractStub<ProductInfoStub> {
    private ProductInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoStub(channel, callOptions);
    }

    /**
     */
    public void addProduct(ProductInfoOuterClass.Product request,
        io.grpc.stub.StreamObserver<ProductInfoOuterClass.ProductID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(ProductInfoOuterClass.ProductID request,
        io.grpc.stub.StreamObserver<ProductInfoOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * package ecommerce;
   * </pre>
   */
  public static final class ProductInfoBlockingStub extends io.grpc.stub.AbstractStub<ProductInfoBlockingStub> {
    private ProductInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductInfoOuterClass.ProductID addProduct(ProductInfoOuterClass.Product request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public ProductInfoOuterClass.Product getProduct(ProductInfoOuterClass.ProductID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * package ecommerce;
   * </pre>
   */
  public static final class ProductInfoFutureStub extends io.grpc.stub.AbstractStub<ProductInfoFutureStub> {
    private ProductInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductInfoOuterClass.ProductID> addProduct(
        ProductInfoOuterClass.Product request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductInfoOuterClass.Product> getProduct(
        ProductInfoOuterClass.ProductID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductInfoImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ProductInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((ProductInfoOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<ProductInfoOuterClass.ProductID>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((ProductInfoOuterClass.ProductID) request,
              (io.grpc.stub.StreamObserver<ProductInfoOuterClass.Product>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ADD_PRODUCT,
        METHOD_GET_PRODUCT);
  }

}
