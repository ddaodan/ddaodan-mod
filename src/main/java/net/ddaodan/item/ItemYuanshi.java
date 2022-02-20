
package net.ddaodan.item;

import net.ddaodan.creativetab.TabDdaodanitem;
import net.ddaodan.ElementsDdaodanMod;

import java.util.List;

@ElementsDdaodanMod.ModElement.Tag
public class ItemYuanshi extends ElementsDdaodanMod.ModElement {
	@GameRegistry.ObjectHolder("ddaodan:yuanshi")
	public static final Item block = null;
	public ItemYuanshi(ElementsDdaodanMod instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ddaodan:yuanshi", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("yuanshi");
			setRegistryName("yuanshi");
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
			list.add(
					"\u8D85\u51FA\u4E16\u754C\u7684\u539F\u521D\u6676\u77F3\u3002 \u9ED1\u6697\u7684\u5B87\u5B99\u4E2D\uFF0C\u7531\u65E0\u4E3B\u7684\u68A6\u60F3\u4E0E\u5E0C\u671B\u51DD\u7ED3\u800C\u6210\u7684\u8F89\u5149\u3002");
		}
	}
}
