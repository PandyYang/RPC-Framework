package com.pandy.myRPCVersion6.client;


import com.pandy.myRPCVersion6.common.RPCRequest;
import com.pandy.myRPCVersion6.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
