package com.ankamagames.framework.ai.criteria.antlrcriteria.parsing;

import com.ankamagames.framework.ai.criteria.antlrcriteria.*;

public class NumericalValueStringParser implements StringParser
{
    @Override
    public ParserObject fromString(final String string) {
        return new ConstantIntegerValue(Integer.parseInt(string));
    }
}
