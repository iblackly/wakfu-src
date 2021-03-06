package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class TableScroll$Button implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TableScroll$Button() {
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
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("styleBoldSmallTitleFont"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final String id = "blackColor";
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut2);
        }
        checkOut2.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final String id2 = "buttonWoodenBackgroundDefault";
        final PixmapBackground checkOut3 = PixmapBackground.checkOut();
        checkOut3.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut3);
        }
        appearance.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(7);
        checkOut4.setPosition(Alignment17.NORTH_WEST);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(12);
        checkOut4.setX(722);
        checkOut4.setY(384);
        checkOut3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(7);
        checkOut5.setPosition(Alignment17.NORTH);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(1);
        checkOut5.setX(777);
        checkOut5.setY(416);
        checkOut3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setFlipHorizontaly(true);
        checkOut6.setHeight(7);
        checkOut6.setPosition(Alignment17.NORTH_EAST);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(12);
        checkOut6.setX(722);
        checkOut6.setY(384);
        checkOut3.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(2);
        checkOut7.setPosition(Alignment17.WEST);
        checkOut7.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut7.setWidth(12);
        checkOut7.setX(890);
        checkOut7.setY(411);
        checkOut3.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setFlipHorizontaly(true);
        checkOut8.setHeight(2);
        checkOut8.setPosition(Alignment17.EAST);
        checkOut8.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut8.setWidth(12);
        checkOut8.setX(890);
        checkOut8.setY(411);
        checkOut3.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(16);
        checkOut9.setPosition(Alignment17.SOUTH_WEST);
        checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut9.setWidth(12);
        checkOut9.setX(868);
        checkOut9.setY(652);
        checkOut3.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(16);
        checkOut10.setPosition(Alignment17.SOUTH);
        checkOut10.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut10.setWidth(1);
        checkOut10.setX(900);
        checkOut10.setY(219);
        checkOut3.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setFlipHorizontaly(true);
        checkOut11.setHeight(16);
        checkOut11.setPosition(Alignment17.SOUTH_EAST);
        checkOut11.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut11.setWidth(12);
        checkOut11.setX(868);
        checkOut11.setY(652);
        checkOut3.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(2);
        checkOut12.setPosition(Alignment17.CENTER);
        checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut12.setWidth(1);
        checkOut12.setX(980);
        checkOut12.setY(240);
        checkOut3.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        checkOut3.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final String id3 = "buttonWoodenBackgroundOver";
        final PixmapBackground checkOut13 = PixmapBackground.checkOut();
        checkOut13.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut13);
        }
        appearance2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setHeight(7);
        checkOut14.setPosition(Alignment17.NORTH_WEST);
        checkOut14.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut14.setWidth(12);
        checkOut14.setX(637);
        checkOut14.setY(384);
        checkOut13.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(7);
        checkOut15.setPosition(Alignment17.NORTH);
        checkOut15.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut15.setWidth(1);
        checkOut15.setX(156);
        checkOut15.setY(425);
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PixmapElement checkOut16 = PixmapElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setFlipHorizontaly(true);
        checkOut16.setHeight(7);
        checkOut16.setPosition(Alignment17.NORTH_EAST);
        checkOut16.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut16.setWidth(12);
        checkOut16.setX(637);
        checkOut16.setY(384);
        checkOut13.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(2);
        checkOut17.setPosition(Alignment17.WEST);
        checkOut17.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut17.setWidth(12);
        checkOut17.setX(868);
        checkOut17.setY(628);
        checkOut13.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final PixmapElement checkOut18 = PixmapElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setFlipHorizontaly(true);
        checkOut18.setHeight(2);
        checkOut18.setPosition(Alignment17.EAST);
        checkOut18.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut18.setWidth(12);
        checkOut18.setX(868);
        checkOut18.setY(628);
        checkOut13.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final PixmapElement checkOut19 = PixmapElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setHeight(16);
        checkOut19.setPosition(Alignment17.SOUTH_WEST);
        checkOut19.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut19.setWidth(12);
        checkOut19.setX(866);
        checkOut19.setY(678);
        checkOut13.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final PixmapElement checkOut20 = PixmapElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setHeight(16);
        checkOut20.setPosition(Alignment17.SOUTH);
        checkOut20.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut20.setWidth(1);
        checkOut20.setX(694);
        checkOut20.setY(239);
        checkOut13.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        final PixmapElement checkOut21 = PixmapElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setFlipHorizontaly(true);
        checkOut21.setHeight(16);
        checkOut21.setPosition(Alignment17.SOUTH_EAST);
        checkOut21.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut21.setWidth(12);
        checkOut21.setX(866);
        checkOut21.setY(678);
        checkOut13.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        final PixmapElement checkOut22 = PixmapElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setHeight(2);
        checkOut22.setPosition(Alignment17.CENTER);
        checkOut22.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut22.setWidth(1);
        checkOut22.setX(446);
        checkOut22.setY(479);
        checkOut13.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        checkOut13.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final String id4 = "buttonWoodenBackgroundPressed";
        final PixmapBackground checkOut23 = PixmapBackground.checkOut();
        checkOut23.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, checkOut23);
        }
        appearance3.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final PixmapElement checkOut24 = PixmapElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setHeight(7);
        checkOut24.setPosition(Alignment17.NORTH_WEST);
        checkOut24.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut24.setWidth(12);
        checkOut24.setX(443);
        checkOut24.setY(142);
        checkOut23.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        final PixmapElement checkOut25 = PixmapElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setHeight(7);
        checkOut25.setPosition(Alignment17.NORTH);
        checkOut25.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut25.setWidth(1);
        checkOut25.setX(231);
        checkOut25.setY(436);
        checkOut23.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final PixmapElement checkOut26 = PixmapElement.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setFlipHorizontaly(true);
        checkOut26.setHeight(7);
        checkOut26.setPosition(Alignment17.NORTH_EAST);
        checkOut26.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut26.setWidth(12);
        checkOut26.setX(443);
        checkOut26.setY(142);
        checkOut23.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final PixmapElement checkOut27 = PixmapElement.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setHeight(1);
        checkOut27.setPosition(Alignment17.WEST);
        checkOut27.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut27.setWidth(12);
        checkOut27.setX(38);
        checkOut27.setY(548);
        checkOut23.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setFlipHorizontaly(true);
        checkOut28.setHeight(1);
        checkOut28.setPosition(Alignment17.EAST);
        checkOut28.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut28.setWidth(12);
        checkOut28.setX(38);
        checkOut28.setY(548);
        checkOut23.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PixmapElement checkOut29 = PixmapElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setHeight(16);
        checkOut29.setPosition(Alignment17.SOUTH_WEST);
        checkOut29.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut29.setWidth(12);
        checkOut29.setX(868);
        checkOut29.setY(633);
        checkOut23.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final PixmapElement checkOut30 = PixmapElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setHeight(16);
        checkOut30.setPosition(Alignment17.SOUTH);
        checkOut30.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut30.setWidth(1);
        checkOut30.setX(829);
        checkOut30.setY(239);
        checkOut23.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        final PixmapElement checkOut31 = PixmapElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setFlipHorizontaly(true);
        checkOut31.setHeight(16);
        checkOut31.setPosition(Alignment17.SOUTH_EAST);
        checkOut31.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut31.setWidth(12);
        checkOut31.setX(868);
        checkOut31.setY(633);
        checkOut23.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        checkOut31.onChildrenAdded();
        final PixmapElement checkOut32 = PixmapElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setHeight(1);
        checkOut32.setPosition(Alignment17.CENTER);
        checkOut32.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut32.setWidth(1);
        checkOut32.setX(649);
        checkOut32.setY(191);
        checkOut23.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        checkOut23.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final String id5 = "buttonWoodenBackgroundDisabled";
        final PixmapBackground checkOut33 = PixmapBackground.checkOut();
        checkOut33.setElementMap(elementMap);
        if (elementMap != null && id5 != null) {
            elementMap.add(id5, checkOut33);
        }
        appearance4.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        final PixmapElement checkOut34 = PixmapElement.checkOut();
        checkOut34.setElementMap(elementMap);
        checkOut34.setHeight(7);
        checkOut34.setPosition(Alignment17.NORTH_WEST);
        checkOut34.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut34.setWidth(12);
        checkOut34.setX(722);
        checkOut34.setY(384);
        checkOut33.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        checkOut34.onChildrenAdded();
        final PixmapElement checkOut35 = PixmapElement.checkOut();
        checkOut35.setElementMap(elementMap);
        checkOut35.setHeight(7);
        checkOut35.setPosition(Alignment17.NORTH);
        checkOut35.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut35.setWidth(1);
        checkOut35.setX(777);
        checkOut35.setY(416);
        checkOut33.addBasicElement(checkOut35);
        checkOut35.onAttributesInitialized();
        checkOut35.onChildrenAdded();
        final PixmapElement checkOut36 = PixmapElement.checkOut();
        checkOut36.setElementMap(elementMap);
        checkOut36.setFlipHorizontaly(true);
        checkOut36.setHeight(7);
        checkOut36.setPosition(Alignment17.NORTH_EAST);
        checkOut36.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut36.setWidth(12);
        checkOut36.setX(722);
        checkOut36.setY(384);
        checkOut33.addBasicElement(checkOut36);
        checkOut36.onAttributesInitialized();
        checkOut36.onChildrenAdded();
        final PixmapElement checkOut37 = PixmapElement.checkOut();
        checkOut37.setElementMap(elementMap);
        checkOut37.setHeight(1);
        checkOut37.setPosition(Alignment17.WEST);
        checkOut37.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut37.setWidth(12);
        checkOut37.setX(967);
        checkOut37.setY(218);
        checkOut33.addBasicElement(checkOut37);
        checkOut37.onAttributesInitialized();
        checkOut37.onChildrenAdded();
        final PixmapElement checkOut38 = PixmapElement.checkOut();
        checkOut38.setElementMap(elementMap);
        checkOut38.setFlipHorizontaly(true);
        checkOut38.setHeight(1);
        checkOut38.setPosition(Alignment17.EAST);
        checkOut38.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut38.setWidth(12);
        checkOut38.setX(967);
        checkOut38.setY(218);
        checkOut33.addBasicElement(checkOut38);
        checkOut38.onAttributesInitialized();
        checkOut38.onChildrenAdded();
        final PixmapElement checkOut39 = PixmapElement.checkOut();
        checkOut39.setElementMap(elementMap);
        checkOut39.setHeight(16);
        checkOut39.setPosition(Alignment17.SOUTH_WEST);
        checkOut39.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut39.setWidth(12);
        checkOut39.setX(868);
        checkOut39.setY(652);
        checkOut33.addBasicElement(checkOut39);
        checkOut39.onAttributesInitialized();
        checkOut39.onChildrenAdded();
        final PixmapElement checkOut40 = PixmapElement.checkOut();
        checkOut40.setElementMap(elementMap);
        checkOut40.setHeight(16);
        checkOut40.setPosition(Alignment17.SOUTH);
        checkOut40.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut40.setWidth(1);
        checkOut40.setX(900);
        checkOut40.setY(219);
        checkOut33.addBasicElement(checkOut40);
        checkOut40.onAttributesInitialized();
        checkOut40.onChildrenAdded();
        final PixmapElement checkOut41 = PixmapElement.checkOut();
        checkOut41.setElementMap(elementMap);
        checkOut41.setFlipHorizontaly(true);
        checkOut41.setHeight(16);
        checkOut41.setPosition(Alignment17.SOUTH_EAST);
        checkOut41.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut41.setWidth(12);
        checkOut41.setX(868);
        checkOut41.setY(652);
        checkOut33.addBasicElement(checkOut41);
        checkOut41.onAttributesInitialized();
        checkOut41.onChildrenAdded();
        final PixmapElement checkOut42 = PixmapElement.checkOut();
        checkOut42.setElementMap(elementMap);
        checkOut42.setHeight(1);
        checkOut42.setPosition(Alignment17.CENTER);
        checkOut42.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut42.setWidth(1);
        checkOut42.setX(717);
        checkOut42.setY(195);
        checkOut33.addBasicElement(checkOut42);
        checkOut42.onAttributesInitialized();
        checkOut42.onChildrenAdded();
        checkOut33.onChildrenAdded();
        appearance4.onChildrenAdded();
    }
}
