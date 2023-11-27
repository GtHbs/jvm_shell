package com.optimize.design_model.decorator;

/**
 * 请求体创建者
 *
 * @author: Kerwinnli
 * @date: 2023/11/27 19:52
 */
public class PacketBodyCreator implements IPacketCreator {
    @Override
    public String handlerContent() {
        return "Content of packet";
    }
}
