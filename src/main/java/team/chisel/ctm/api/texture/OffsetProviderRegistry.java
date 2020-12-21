package team.chisel.ctm.api.texture;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import team.chisel.ctm.client.impl.OffsetProviderRegistryImpl;

/**
 * Registry for {@link OffsetProvider}. Use {@link OffsetProvider#INSTANCE} to obtain an instance of this class.
 */
public interface OffsetProviderRegistry {
	public static final OffsetProviderRegistry INSTANCE = new OffsetProviderRegistryImpl();

	public void register(OffsetProvider provider);
	
	public Vec3i getOffset(World world, BlockPos pos);
}
