
package net.ddaodan.creativetab;

import net.ddaodan.item.ItemRpgitem;
import net.ddaodan.ElementsDdaodanMod;

@ElementsDdaodanMod.ModElement.Tag
public class TabDdaodanitem extends ElementsDdaodanMod.ModElement {
	public TabDdaodanitem(ElementsDdaodanMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabddaodanitem") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRpgitem.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
