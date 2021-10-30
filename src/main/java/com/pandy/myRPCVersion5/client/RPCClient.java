package com.pandy.myRPCVersion5.client;


import com.pandy.myRPCVersion5.common.RPCRequest;
import com.pandy.myRPCVersion5.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
