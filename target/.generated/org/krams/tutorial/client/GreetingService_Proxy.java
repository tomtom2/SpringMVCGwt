package org.krams.tutorial.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class GreetingService_Proxy extends RemoteServiceProxy implements org.krams.tutorial.client.GreetingServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.krams.tutorial.client.GreetingService";
  private static final String SERIALIZATION_POLICY ="C646FCFFFDC09969020532ED02CD9220";
  private static final org.krams.tutorial.client.GreetingService_TypeSerializer SERIALIZER = new org.krams.tutorial.client.GreetingService_TypeSerializer();
  
  public GreetingService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "rpc/greet", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void greetServer(java.lang.String p0, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("GreetingService_Proxy.greetServer", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("greetServer");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(p0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("GreetingService_Proxy.greetServer",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "GreetingService_Proxy.greetServer", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
