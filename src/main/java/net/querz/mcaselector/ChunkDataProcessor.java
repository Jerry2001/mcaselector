package net.querz.mcaselector;

import net.querz.nbt.CompoundTag;
import java.awt.image.BufferedImage;

public interface ChunkDataProcessor {
	void drawImage2(CompoundTag root, ColorMapping colorMapping, int x, int z, BufferedImage image);
}