
package net.ddaodan.item;

import net.ddaodan.creativetab.TabDdaodanitem;
import net.ddaodan.ElementsDdaodanMod;

import java.util.List;

@ElementsDdaodanMod.ModElement.Tag
public class ItemJiuchanzhiyuan extends ElementsDdaodanMod.ModElement {
	@GameRegistry.ObjectHolder("ddaodan:jiuchanzhiyuan")
	public static final Item block = null;
	public ItemJiuchanzhiyuan(ElementsDdaodanMod instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ddaodan:jiuchanzhiyuan", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("jiuchanzhiyuan");
			setRegistryName("jiuchanzhiyuan");
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
					"\u8FDE\u63A5\u68A6\u60F3\u7684\u547D\u8FD0\u4E4B\u79CD\u3002 \u7F18\u77F3\u8F89\u5149\u80FD\u8BA9\u672C\u65E0\u4EA4\u96C6\u7684\u547D\u8FD0\u4EA4\u9519\uFF0C\u8BA9\u5F7C\u6B64\u7684\u68A6\u60F3\u76F8\u8FDE\uFF0C\u6B63\u5982\u8FD9\u79CD\u5149\u8F89\u5C06\u7FA4\u661F\u8FDE\u6210\u5FC3\u4E4B\u6240\u5411\u7684\u56FE\u5F62\u3002");
		}
	}
}
