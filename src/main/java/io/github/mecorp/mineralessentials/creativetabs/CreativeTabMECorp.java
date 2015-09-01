package io.github.mecorp.mineralessentials.creativetabs;

import io.github.mecorp.mineralessentials.creative.items.CreativeItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 13/11/2014.
 */
public class CreativeTabMECorp
{
     public static final CreativeTabs MECorp = new CreativeTabs(Reference.MOD_ID)
     {
          @Override
          public Item getTabIconItem()
          {
              return CreativeItems.MECorp;
          }

          @Override
          public String getTranslatedTabLabel()
          {
              return "ME-Corp";
          }
      };
}
