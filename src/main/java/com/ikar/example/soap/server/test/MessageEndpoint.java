package com.ikar.example.soap.server.test;

import com.ikar.example.soap.server.messages.GetMessageRequest;
import com.ikar.example.soap.server.messages.GetMessageResponse;
import com.ikar.example.soap.server.messages.MessageDTO;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MessageEndpoint {

    @PayloadRoot(namespace = "http://server.soap.example.ikar.com/messages", localPart = "GetMessageRequest")
    @ResponsePayload
    public GetMessageResponse proccessMessageById(@RequestPayload GetMessageRequest request) {
        GetMessageResponse response = new GetMessageResponse();

        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setId(1);
        messageDTO.setBody("some body");
        messageDTO.setHead("some head");
        response.setMessage(messageDTO);
        return response;
    }

}
