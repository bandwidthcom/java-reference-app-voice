package com.catapult.app.example.beans;

import com.bandwidth.sdk.model.events.Event;
import com.bandwidth.sdk.model.events.HangupEvent;
import com.bandwidth.sdk.model.events.IncomingCallEvent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallEvents implements Serializable {

    private static final long serialVersionUID = -5147454881949650162L;

    private String callId;

    private List<Event> events = new ArrayList<>();

    public CallEvents(String callId) {
        this.callId = callId;
    }

    public String getCallId() {
        return callId;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallDetails{");
        sb.append("callId='").append(callId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
