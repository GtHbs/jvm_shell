package com.optimize.design_model.decorator;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 19:54
 */
public class PacketHTMLHeaderCreator extends PacketDecorator{

    public PacketHTMLHeaderCreator(IPacketCreator iPacketCreator) {
        super(iPacketCreator);
    }

    @Override
    public String handlerContent() {
        return "<html>" +
                "<body>" +
                iPacketCreator.handlerContent() +
                "</body>" +
                "</html>";
    }
}
