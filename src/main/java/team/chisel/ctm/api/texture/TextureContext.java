package team.chisel.ctm.api.texture;

/**
 * The context passed when a CTMTexture transforms a quad.
 */
public interface TextureContext {
	/**
	 * Gets the compressed data. Will only use bits up to the given compressed data length.
	 */
	long getCompressedData();
}
