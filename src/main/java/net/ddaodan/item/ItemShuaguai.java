
package net.ddaodan.item;

import net.ddaodan.creativetab.TabDdaodanicon;
import net.ddaodan.ElementsDdaodanMod;

@ElementsDdaodanMod.ModElement.Tag
public class ItemShuaguai extends ElementsDdaodanMod.ModElement {
	@GameRegistry.ObjectHolder("ddaodan:shuaguai")
	public static final Item block = null;
	public ItemShuaguai(ElementsDdaodanMod instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ddaodan:shuaguai", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("shuaguai");
			setRegistryName("shuaguai");
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
