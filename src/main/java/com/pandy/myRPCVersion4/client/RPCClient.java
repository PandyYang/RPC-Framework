package com.pandy.myRPCVersion4.client;


import com.pandy.myRPCVersion4.common.RPCRequest;
import com.pandy.myRPCVersion4.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
