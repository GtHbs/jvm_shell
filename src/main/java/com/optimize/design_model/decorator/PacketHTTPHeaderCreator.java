package com.optimize.design_model.decorator;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:57
 */
public class PacketHTTPHeaderCreator extends PacketDecorator{

    public PacketHTTPHeaderCreator(IPacketCreator iPacketCreator) {
        super(iPacketCreator);
    }

    @Override
    public String handlerContent() {
        return "Cache-Control:no-cache\n" +
                "Date:xxx" +
                iPacketCreator.handlerContent();
    }
}
