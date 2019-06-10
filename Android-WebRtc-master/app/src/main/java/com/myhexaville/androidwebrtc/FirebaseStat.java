package com.myhexaville.androidwebrtc;

public class FirebaseStat {
    public int packetsLost;
    public int packetsReceived;
    public int bytesReceived;
    public int bytesSent;
    public int packetsSent;
    public int requestsSent;
    public int responsesSent;
    public int responsesReceived;
    public int googJitterReceived;
    public int googRtt;
    public int packetsLostInc;
    public int packetsReceivedInc;
    public int bytesReceivedInc;
    public int bytesSentInc;
    public int packetsSentInc;
    public int requestsSentInc;
    public int responsesSentInc;
    public int responsesReceivedInc;
    public int googJitterReceivedInc;
    public int googRttInc;

    public FirebaseStat() {
        this.packetsLost = 0;
        this.packetsReceived = 0;
        this.bytesReceived = 0;
        this.bytesSent = 0;
        this.packetsSent = 0;
        this.requestsSent = 0;
        this.responsesSent = 0;
        this.responsesReceived = 0;
        this.googJitterReceived = 0;
        this.googRtt = 0;
        this.packetsLostInc = 0;
        this.packetsReceivedInc = 0;
        this.bytesReceivedInc = 0;
        this.bytesSentInc = 0;
        this.packetsSentInc = 0;
        this.requestsSentInc = 0;
        this.responsesSentInc = 0;
        this.responsesReceivedInc = 0;
        this.googJitterReceivedInc = 0;
        this.googRttInc = 0;
    }

    public void getInc(FirebaseStat prev){
        this.packetsLostInc = this.packetsLost - prev.packetsLost;
        this.packetsReceivedInc = this.packetsReceivedInc - prev.packetsReceivedInc;
        this.bytesReceivedInc = this.bytesReceivedInc - prev.bytesReceivedInc;
        this.bytesSentInc = this.bytesSentInc - prev.bytesSentInc;
        this.packetsSentInc = this.packetsSentInc - prev.packetsSentInc;
        this.requestsSentInc = this.requestsSentInc - prev.requestsSentInc;
        this.responsesSentInc = this.responsesSentInc - prev.responsesSentInc;
        this.responsesReceivedInc = this.responsesReceivedInc - prev.responsesReceivedInc;
        this.googJitterReceivedInc = this.googJitterReceivedInc - prev.googJitterReceivedInc;
        this.googRttInc = this.googRttInc - prev.googRttInc;
    }
}
