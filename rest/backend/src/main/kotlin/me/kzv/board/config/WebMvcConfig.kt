package me.kzv.board.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.resource.PathResourceResolver


@Configuration
class WebMvcConfig : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/*/**")
            .addResourceLocations("classpath:/static/")
            .resourceChain(true)
            .addResolver(object:PathResourceResolver(){
                 override fun getResource( resourcePath: String,  location: Resource) : Resource{
                    val requestedResource : Resource = location.createRelative(resourcePath)
                    return if(requestedResource.exists() && requestedResource.isReadable)requestedResource else ClassPathResource("/static/index.html")
                }
            })
    }

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods(
                HttpMethod.GET.name,
                HttpMethod.HEAD.name,
                HttpMethod.POST.name,
                HttpMethod.PUT.name,
                HttpMethod.PATCH.name,
                HttpMethod.DELETE.name
            )
            .exposedHeaders("Content-Disposition", "Authorization", "Location")
    }
}
