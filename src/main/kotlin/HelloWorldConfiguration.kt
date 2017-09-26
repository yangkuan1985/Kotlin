import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.view.JstlView

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("helloworld.controller"))
abstract class HelloWorldConfiguration {
    fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()

        viewResolver.setViewClass(JstlView::class.java)
        viewResolver.setPrefix("/WEB-INF/views/")
        viewResolver.setSuffix(".jsp")

        return viewResolver
    }
}