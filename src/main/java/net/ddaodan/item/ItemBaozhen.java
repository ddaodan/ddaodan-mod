
package net.ddaodan.item;

import net.ddaodan.creativetab.TabDdaodanitem;
import net.ddaodan.ElementsDdaodanMod;

import java.util.List;

@ElementsDdaodanMod.ModElement.Tag
public class ItemBaozhen extends ElementsDdaodanMod.ModElement {
	@GameRegistry.ObjectHolder("ddaodan:baozhen")
	public static final Item block = null;
	public ItemBaozhen(ElementsDdaodanMod instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ddaodan:baozhen", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("baozhen");
			setRegistryName("baozhen");
			setCreativeTab(TabDdaodanitem.tab);
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u771F\u00B7\u62B1\u6795");
		}
	}
}
