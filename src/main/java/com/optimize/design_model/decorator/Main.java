package com.optimize.design_model.decorator;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:58
 */
public class Main {

    public static void main(String[] args) {
        IPacketCreator creator = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PacketBodyCreator()));
        System.out.println(creator.handlerContent());
    }
}
