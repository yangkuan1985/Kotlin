import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext
import javax.servlet.ServletException

class HelloWorldInitializer : WebApplicationInitializer {

    @Throws(ServletException::class)
    override fun onStartup(container: ServletContext) {

        val ctx = AnnotationConfigWebApplicationContext()
        ctx.register(HelloWorldConfiguration::class.java)
        ctx.servletContext = container

        val servlet = container.addServlet("dispatcher", DispatcherServlet(ctx))

        servlet.setLoadOnStartup(1)
        servlet.addMapping("/")
    }
}