package com.myhexaville.androidwebrtc;

public class FirebaseStat {
    public int packetsLost;
    public int packetsRecieved;
    public int bytesRecieved;
    public int bytesSent;
    public int packetsSent;
    public int requestsSent;
    public int responsesSent;
    public int responsesRecieved;
    public int googJitterReceived;
    public int googRtt;
    public int packetsLostInc;
    public int packetsRecievedInc;
    public int bytesRecievedInc;
    public int bytesSentInc;
    public int packetsSentInc;
    public int requestsSentInc;
    public int responsesSentInc;
    public int responsesRecievedInc;
    public int googJitterReceivedInc;
    public int googRttInc;

    public FirebaseStat() {
        this.packetsLost = 0;
        this.packetsRecieved = 0;
        this.bytesRecieved = 0;
        this.bytesSent = 0;
        this.packetsSent = 0;
        this.requestsSent = 0;
        this.responsesSent = 0;
        this.responsesRecieved = 0;
        this.googJitterReceived = 0;
        this.googRtt = 0;
        this.packetsLostInc = 0;
        this.packetsRecievedInc = 0;
        this.bytesRecievedInc = 0;
        this.bytesSentInc = 0;
        this.packetsSentInc = 0;
        this.requestsSentInc = 0;
        this.responsesSentInc = 0;
        this.responsesRecievedInc = 0;
        this.googJitterReceivedInc = 0;
        this.googRttInc = 0;
    }

    public void getInc(FirebaseStat prev){
        this.packetsLostInc = this.packetsLost - prev.packetsLost;
        this.packetsRecievedInc = this.packetsRecievedInc - prev.packetsRecievedInc;
        this.bytesRecievedInc = this.bytesRecievedInc - prev.bytesRecievedInc;
        this.bytesSentInc = this.bytesSentInc - prev.bytesSentInc;
        this.packetsSentInc = this.packetsSentInc - prev.packetsSentInc;
        this.requestsSentInc = this.requestsSentInc - prev.requestsSentInc;
        this.responsesSentInc = this.responsesSentInc - prev.responsesSentInc;
        this.responsesRecievedInc = this.responsesRecievedInc - prev.responsesRecievedInc;
        this.googJitterReceivedInc = this.googJitterReceivedInc - prev.googJitterReceivedInc;
        this.googRttInc = this.googRttInc - prev.googRttInc;
    }
}
