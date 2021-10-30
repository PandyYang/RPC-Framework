package com.pandy.myRPCVersion3.client;


import com.pandy.myRPCVersion3.common.RPCRequest;
import com.pandy.myRPCVersion3.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
