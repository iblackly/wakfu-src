package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import org.jetbrains.annotations.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.game.fight.protagonists.*;
import com.ankamagames.wakfu.common.datas.specific.*;
import com.ankamagames.baseImpl.common.clientAndServer.game.characteristic.*;
import com.ankamagames.wakfu.common.datas.*;
import com.ankamagames.framework.kernel.core.maths.*;
import com.ankamagames.wakfu.common.game.fight.*;
import java.util.*;

public final class GetFightersLevelDiff extends FunctionValue
{
    private static ArrayList<ParserType[]> signatures;
    public static final String MONSTER = "monster";
    private boolean m_monsters;
    
    public GetFightersLevelDiff(final ArrayList<ParserObject> args) {
        super();
        if (args.isEmpty()) {
            return;
        }
        this.m_monsters = "monster".equalsIgnoreCase(args.get(0).getValue());
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.GET_PLAYERS_LEVEL_DIFF;
    }
    
    @Override
    protected List<ParserType[]> getSignatures() {
        return GetFightersLevelDiff.signatures;
    }
    
    @Override
    public boolean isInteger() {
        return true;
    }
    
    @Override
    public long getLongValue(@Nullable final Object criterionUser, @Nullable final Object criterionTarget, @Nullable final Object criterionContent, @Nullable final Object criterionContext) {
        if (criterionContext == null) {
            throw new CriteriaExecutionException("Pas de contexte...");
        }
        final AbstractFight<?> fight = CriteriaUtils.getFight(criterionUser, criterionContext);
        if (fight == null) {
            throw new CriteriaExecutionException("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        final byte type = (byte)(this.m_monsters ? 1 : 0);
        final Collection<? extends BasicCharacterInfo> fighters = fight.getFighters(ProtagonistFilter.inPlay(), ProtagonistFilter.ofType(type), ProtagonistFilter.not(ProtagonistFilter.hasProperty(WorldPropertyType.NOT_PRESENT_IN_TIMELINE)));
        short minLevel = 32767;
        short maxLevel = 0;
        for (final BasicCharacterInfo f : fighters) {
            maxLevel = MathHelper.maxShort(maxLevel, f.getLevel());
            minLevel = MathHelper.minShort(minLevel, f.getLevel());
        }
        return maxLevel - minLevel;
    }
    
    static {
        GetFightersLevelDiff.signatures = new ArrayList<ParserType[]>();
        ParserType[] sig = new ParserType[0];
        GetFightersLevelDiff.signatures.add(sig);
        sig = new ParserType[] { ParserType.STRING };
        GetFightersLevelDiff.signatures.add(sig);
    }
}
