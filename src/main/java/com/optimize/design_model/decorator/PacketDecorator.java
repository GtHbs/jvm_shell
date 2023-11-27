package com.optimize.design_model.decorator;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:53
 */
public abstract class PacketDecorator implements IPacketCreator {

    protected IPacketCreator iPacketCreator;

    public PacketDecorator(IPacketCreator iPacketCreator) {
        this.iPacketCreator = iPacketCreator;
    }
}
