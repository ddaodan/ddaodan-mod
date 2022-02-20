
package net.ddaodan.creativetab;

import net.ddaodan.item.ItemHecheng;
import net.ddaodan.ElementsDdaodanMod;

@ElementsDdaodanMod.ModElement.Tag
public class TabDdaodanicon extends ElementsDdaodanMod.ModElement {
	public TabDdaodanicon(ElementsDdaodanMod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabddaodanicon") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemHecheng.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
