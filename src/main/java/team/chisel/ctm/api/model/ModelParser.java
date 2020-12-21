package team.chisel.ctm.api.model;

import java.lang.reflect.Type;

import org.jetbrains.annotations.NotNull;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

import net.minecraft.client.render.model.json.JsonUnbakedModel;

public interface ModelParser {
	@NotNull
	CTMUnbakedModel parse(JsonUnbakedModel jsonModel, JsonObject jsonObject, Type type, JsonDeserializationContext context);
}
