package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class LabelMoneyInvalid implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public LabelMoneyInvalid() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlignment(Alignment9.CENTER);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("defaultBoldFont"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final String id = "redColor";
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut2);
        }
        checkOut2.setColor(new Color(0.9f, 0.06f, 0.06f, 1.0f));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final String id2 = "labelMoneyBorder";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, pixmapBorder);
        }
        appearance.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(6);
        checkOut3.setPosition(Alignment17.NORTH_WEST);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(26);
        checkOut3.setX(241);
        checkOut3.setY(141);
        pixmapBorder.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(6);
        checkOut4.setPosition(Alignment17.NORTH);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(1);
        checkOut4.setX(191);
        checkOut4.setY(396);
        pixmapBorder.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(6);
        checkOut5.setPosition(Alignment17.NORTH_EAST);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(26);
        checkOut5.setX(419);
        checkOut5.setY(628);
        pixmapBorder.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(11);
        checkOut6.setPosition(Alignment17.EAST);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(26);
        checkOut6.setX(691);
        checkOut6.setY(166);
        pixmapBorder.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(6);
        checkOut7.setPosition(Alignment17.SOUTH_EAST);
        checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut7.setWidth(26);
        checkOut7.setX(212);
        checkOut7.setY(141);
        pixmapBorder.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(6);
        checkOut8.setPosition(Alignment17.SOUTH);
        checkOut8.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut8.setWidth(1);
        checkOut8.setX(191);
        checkOut8.setY(378);
        pixmapBorder.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(6);
        checkOut9.setPosition(Alignment17.SOUTH_WEST);
        checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut9.setWidth(26);
        checkOut9.setX(546);
        checkOut9.setY(141);
        pixmapBorder.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(11);
        checkOut10.setPosition(Alignment17.WEST);
        checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut10.setWidth(26);
        checkOut10.setX(785);
        checkOut10.setY(152);
        pixmapBorder.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        final String id3 = "labelMoneyBackground";
        final PixmapBackground checkOut11 = PixmapBackground.checkOut();
        checkOut11.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut11);
        }
        checkOut11.setScaled(true);
        appearance.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(11);
        checkOut12.setPosition(Alignment17.CENTER);
        checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut12.setWidth(1);
        checkOut12.setX(1020);
        checkOut12.setY(583);
        checkOut11.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        checkOut11.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
