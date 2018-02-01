package com.zhaidaosi.game.server.model.area;

import com.zhaidaosi.game.jgframework.model.area.BaseArea;
import io.netty.channel.group.ChannelGroup;

public class Area extends BaseArea {

    public static int ID = 1;

    public Area() {
        super(ID, "场景一");
    }

    @Override
    public void init() {

    }
}
