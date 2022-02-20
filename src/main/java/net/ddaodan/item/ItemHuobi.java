
package net.ddaodan.item;

import net.ddaodan.creativetab.TabDdaodanicon;
import net.ddaodan.ElementsDdaodanMod;

@ElementsDdaodanMod.ModElement.Tag
public class ItemHuobi extends ElementsDdaodanMod.ModElement {
	@GameRegistry.ObjectHolder("ddaodan:huobi")
	public static final Item block = null;
	public ItemHuobi(ElementsDdaodanMod instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ddaodan:huobi", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("huobi");
			setRegistryName("huobi");
			setCreativeTab(TabDdaodanicon.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
