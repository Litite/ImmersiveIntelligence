package pl.pabilo8.immersiveintelligence.api.data;

import net.minecraft.util.EnumFacing;

import javax.annotation.Nullable;

/**
 * @author Pabilo8
 * @since 2019-06-01
 */
public interface IDataDevice
{
	void onReceive(DataPacket packet, @Nullable EnumFacing side);

	void onSend();
}
