package com.ankamagames.wakfu.client.console.command.admin.commands;

import com.ankamagames.wakfu.client.console.command.admin.commands.annotation.*;
import com.ankamagames.baseImpl.common.clientAndServer.account.admin.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.*;
import com.ankamagames.baseImpl.client.proxyclient.base.network.protocol.message.*;
import com.ankamagames.framework.kernel.core.common.message.*;
import com.ankamagames.baseImpl.client.proxyclient.base.network.*;

@Documentation(commandName = "freedom", commandParameters = "&lt;pseudo&gt;", commandRights = { AdminRightsGroup.ADMINISTRATOR, AdminRightsGroup.STAFF, AdminRightsGroup.MODERATOR }, commandDescription = "Put off of moderation jail player with specified pseudo.", commandObsolete = false)
public class FreedomCommand extends ModerationCommand
{
    private final String m_pseudo;
    
    public FreedomCommand(final String pseudo) {
        super();
        this.m_pseudo = pseudo;
    }
    
    @Override
    public boolean isValid() {
        return !this.m_pseudo.isEmpty();
    }
    
    @Override
    public void execute() {
        final NetworkEntity networkEntity = WakfuGameEntity.getInstance().getNetworkEntity();
        if (networkEntity == null) {
            ConsoleManager.getInstance().err("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        final ModerationCommandMessage netMessage = new ModerationCommandMessage();
        netMessage.setServerId((byte)2);
        netMessage.setCommand((short)203);
        netMessage.addStringParameter(this.m_pseudo);
        networkEntity.sendMessage(netMessage);
    }
}
