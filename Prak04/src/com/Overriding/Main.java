package com.Overriding;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.suara();
        Anjing anjing = new Anjing();
        anjing.suara();
        Sapi sapi = new Sapi();
        sapi.suara();
    }
}