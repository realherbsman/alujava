package alujava.boot.server.configurations;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;

@Configuration
public class JsonConfiguration {

	private static class JsonBuilderCustomizer implements Jackson2ObjectMapperBuilderCustomizer {

		@Override
		public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
			TypeResolverBuilder<?> typer = new DefaultTypeResolverBuilder(DefaultTyping.NON_FINAL);
	        // we'll always use full class name, when using defaulting
	        typer = typer.init(JsonTypeInfo.Id.CLASS, null);
	        typer = typer.inclusion(JsonTypeInfo.As.PROPERTY);
			jacksonObjectMapperBuilder.defaultTyping(typer);
		}
		
	}
	
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer j2OMBCustomizer() {
		return new JsonBuilderCustomizer();
	}
	
}
