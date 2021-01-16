package team.chisel.ctm.api.client;

/**
 * Root interface representing a type of CTM texture. To register, use {@link TextureTypeRegistry}.
 */
public interface TextureType extends ContextProvider {
	/**
	 * Make a CTM Texture from a list of sprites.
	 *
	 * <p>Tip: The return of this method can be explicitly typed without warnings or errors. For instance,
	 * <blockquote>
	 * <code>public CTMTexture{@literal <}MyTextureType{@literal >} makeTexture(...) {...}</code>
	 * </blockquote>
	 * is a valid override of this method.
	 * @param info A {@link TextureInfo} object which contains all the information that about this texture
	 */
	<T extends TextureType> CTMTexture<? extends T> makeTexture(TextureInfo info);

	/**
	 * The number of textures required for this texture type.
	 * For instance, {@link team.chisel.ctm.client.texture.type.TextureTypeCTM} requires two.
	 * @return The number of textures required.
	 */
	default int requiredTextures() {
		return 1;
	}
}
